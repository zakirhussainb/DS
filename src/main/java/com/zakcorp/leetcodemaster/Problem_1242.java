package com.zakcorp.leetcodemaster;

import java.util.*;
import java.util.concurrent.*;

class HtmlParser {
    Map<String, List<VertexInfo>> webMap = new HashMap<>();
    String[] urlMap;
    public HtmlParser(String[] urlMap) {
//        urlMap = new String[]{"http://sta.zizqt.xyz/hwhi","http://sta.zizqt.xyz/ngvk","http://sta.zizqt.xyz/dcts","http://sta.zizqt.xyz/tyve","http://sta.zizqt.xyz/zers","http://sta.zizqt.xyz/nelq","http://sta.zizqt.xyz/xmtm","http://sta.zizqt.xyz/zgfc","http://sta.zizqt.xyz/fyvg","http://sta.zizqt.xyz/lopo","http://sta.zizqt.xyz/hmbu","http://sta.zizqt.xyz/fete","http://sta.zizqt.xyz/ncly","http://sta.zizqt.xyz/julk","http://sta.zizqt.xyz/zity","http://sta.zizqt.xyz/jmty","http://sta.zizqt.xyz/jyrc","http://sta.zizqt.xyz/rafa","http://sta.zizqt.xyz/nyto","http://sta.zizqt.xyz/notq","http://sta.zizqt.xyz/lcvs","http://sta.zizqt.xyz/lcva","http://sta.zizqt.xyz/xsha","http://sta.zizqt.xyz/nedc","http://sta.zizqt.xyz/xodm","http://sta.zizqt.xyz/judc","http://sta.zizqt.xyz/pyva","http://sta.zizqt.xyz/xurc","http://sta.zizqt.xyz/xirg","http://sta.zizqt.xyz/bgxq","http://sta.zizqt.xyz/patg","http://sta.zizqt.xyz/vqra","http://sta.zizqt.xyz/dsri","http://sta.zizqt.xyz/bexa","http://sta.zizqt.xyz/nuze","http://sta.zizqt.xyz/xoze","http://sta.zizqt.xyz/vezw","http://sta.zizqt.xyz/hwjq","http://sta.zizqt.xyz/pgvi","http://sta.zizqt.xyz/xsji","http://sta.zizqt.xyz/rory","http://sta.zizqt.xyz/zwxy","http://sta.zizqt.xyz/byjq","http://sta.zizqt.xyz/dilo","http://sta.zizqt.xyz/novi","http://sta.zizqt.xyz/rmdq","http://sta.zizqt.xyz/vudg","http://sta.zizqt.xyz/jktq","http://sta.zizqt.xyz/psbw","http://sta.zizqt.xyz/dohw","http://sta.zizqt.xyz/tslu","http://sta.zizqt.xyz/zejw","http://sta.zizqt.xyz/vyxm","http://sta.zizqt.xyz/xkjk","http://sta.zizqt.xyz/xkdq","http://sta.zizqt.xyz/fiva","http://sta.zizqt.xyz/zuvm","http://sta.zizqt.xyz/vohu","http://sta.zizqt.xyz/dqjo","http://sta.zizqt.xyz/rkjm","http://sta.zizqt.xyz/xwfa","http://sta.zizqt.xyz/donq","http://sta.zizqt.xyz/dsde","http://sta.zizqt.xyz/lqpw","http://sta.zizqt.xyz/pmlk","http://sta.zizqt.xyz/pedk","http://sta.zizqt.xyz/hgrk","http://sta.zizqt.xyz/xsxw","http://sta.zizqt.xyz/pcba","http://sta.zizqt.xyz/dcvs","http://sta.zizqt.xyz/vahq","http://sta.zizqt.xyz/ripm","http://sta.zizqt.xyz/fwva","http://sta.zizqt.xyz/fmhq","http://sta.zizqt.xyz/tipe","http://sta.zizqt.xyz/hezs","http://sta.zizqt.xyz/naju","http://sta.zizqt.xyz/zmlw","http://sta.zizqt.xyz/zgto","http://sta.zizqt.xyz/dwvy","http://sta.zizqt.xyz/fwfu","http://sta.zizqt.xyz/tcna","http://sta.zizqt.xyz/bgho","http://sta.zizqt.xyz/vkvi","http://sta.zizqt.xyz/fudk","http://sta.zizqt.xyz/dchy","http://sta.zizqt.xyz/diby","http://sta.zizqt.xyz/xono","http://sta.zizqt.xyz/fadm","http://sta.zizqt.xyz/venm","http://sta.zizqt.xyz/zahs","http://sta.zizqt.xyz/hchg","http://sta.zizqt.xyz/dihm","http://sta.zizqt.xyz/typg","http://sta.zizqt.xyz/xojy","http://sta.zizqt.xyz/berq","http://sta.zizqt.xyz/xevi","http://sta.zizqt.xyz/fytu","http://sta.zizqt.xyz/bcfy","http://sta.zizqt.xyz/tebo","http://sta.zizqt.xyz/vixg","http://sta.zizqt.xyz/twhs","http://sta.zizqt.xyz/xahy","http://sta.zizqt.xyz/vetq","http://sta.zizqt.xyz/fyhk","http://sta.zizqt.xyz/pubq","http://sta.zizqt.xyz/batq","http://sta.zizqt.xyz/tabg","http://sta.zizqt.xyz/zehy","http://sta.zizqt.xyz/xsfw","http://sta.zizqt.xyz/vyre","http://sta.zizqt.xyz/vaxa","http://sta.zizqt.xyz/fqpa","http://sta.zizqt.xyz/lozw","http://sta.zizqt.xyz/nmlw","http://sta.zizqt.xyz/jofs","http://sta.zizqt.xyz/fajm","http://sta.zizqt.xyz/rgpe","http://sta.zizqt.xyz/fcvo","http://sta.zizqt.xyz/vwbu","http://sta.zizqt.xyz/telm","http://sta.zizqt.xyz/hoti","http://sta.zizqt.xyz/zgfo","http://sta.zizqt.xyz/xapy","http://sta.zizqt.xyz/fmxq","http://sta.zizqt.xyz/bsjg","http://sta.zizqt.xyz/vqbo","http://sta.zizqt.xyz/fybq","http://sta.zizqt.xyz/dglo","http://sta.zizqt.xyz/xapu","http://sta.zizqt.xyz/rkjy","http://sta.zizqt.xyz/zgfy","http://sta.zizqt.xyz/vgds","http://sta.zizqt.xyz/dana","http://sta.zizqt.xyz/pmrs","http://sta.zizqt.xyz/pkjg","http://sta.zizqt.xyz/naxi","http://sta.zizqt.xyz/jqpg","http://sta.zizqt.xyz/johs","http://sta.zizqt.xyz/lqla","http://sta.zizqt.xyz/pqbc","http://sta.zizqt.xyz/xqfw","http://sta.zizqt.xyz/hmbg","http://sta.zizqt.xyz/rkta","http://sta.zizqt.xyz/vyzq","http://sta.zizqt.xyz/bszs","http://sta.zizqt.xyz/lyxe","http://sta.zizqt.xyz/bahq","http://sta.zizqt.xyz/xgje","http://sta.zizqt.xyz/tojy","http://sta.zizqt.xyz/xyhu","http://sta.zizqt.xyz/psza","http://sta.zizqt.xyz/nyzk","http://sta.zizqt.xyz/xqvg","http://sta.zizqt.xyz/tepq","http://sta.zizqt.xyz/bgbg","http://sta.zizqt.xyz/tcjk","http://sta.zizqt.xyz/vgnq","http://sta.zizqt.xyz/byhc","http://sta.zizqt.xyz/pqrg","http://sta.zizqt.xyz/jwdw","http://sta.zizqt.xyz/bcja","http://sta.zizqt.xyz/pedy","http://sta.zizqt.xyz/vurk","http://sta.zizqt.xyz/jizs","http://sta.zizqt.xyz/bczs","http://sta.zizqt.xyz/zely","http://sta.zizqt.xyz/zgnc","http://sta.zizqt.xyz/hgxa","http://sta.zizqt.xyz/divm","http://sta.zizqt.xyz/hsfu","http://sta.zizqt.xyz/jsnk","http://sta.zizqt.xyz/pyvs","http://sta.zizqt.xyz/nehq","http://sta.zizqt.xyz/vkfs","http://sta.zizqt.xyz/lgps","http://sta.zizqt.xyz/fuls","http://sta.zizqt.xyz/juty","http://sta.zizqt.xyz/turu","http://sta.zizqt.xyz/xejs","http://sta.zizqt.xyz/rgxw","http://sta.zizqt.xyz/lofy","http://sta.zizqt.xyz/fubi","http://sta.zizqt.xyz/fafe","http://sta.zizqt.xyz/hspq","http://sta.zizqt.xyz/paja","http://sta.zizqt.xyz/lobw","http://sta.zizqt.xyz/xmvy","http://sta.zizqt.xyz/vmbo","http://sta.zizqt.xyz/hufa","http://sta.zizqt.xyz/bqre","http://sta.zizqt.xyz/dqdi","http://sta.zizqt.xyz/jwrc","http://sta.zizqt.xyz/pcni","http://sta.zizqt.xyz/fujg","http://sta.zizqt.xyz/nmzg","http://sta.zizqt.xyz/pqdu","http://sta.zizqt.xyz/twzm","http://sta.zizqt.xyz/jerw","http://sta.zizqt.xyz/taly","http://sta.zizqt.xyz/tmbo","http://sta.zizqt.xyz/zqbw","http://sta.zizqt.xyz/xafa","http://sta.zizqt.xyz/tetu","http://sta.zizqt.xyz/ruvm","http://sta.zizqt.xyz/lwxg","http://sta.zizqt.xyz/dqvu","http://sta.zizqt.xyz/piju","http://sta.zizqt.xyz/tgzy","http://sta.zizqt.xyz/honm","http://xot.qnyfe.info/zytq","http://whm.pgloz.red/sxqh","http://tul.unuba.info/fszq","http://gfc.jclij.pub/qnst","http://dst.ubgfo.net/bszy","http://uxk.lobap.info/onyx","http://jwv.axsps.xyz/jkze","http://qrw.nizyz.com/mdeh","http://loz.irkbg.red/tirg","http://mzq.rqtwh.info/srsb","http://nyr.ytgjq.tech/twhs","http://ivq.hatsb.tech/gnwn","http://hqz.afsbe.ink/dmpa","http://ybg.zazgh.info/cpqf","http://bix.gzipw.com/tqje","http://kxo.hahsl.pub/ahsf","http://zgf.eluhe.edu/lipa","http://qhy.xobwx.com/qlyx","http://viv.adgna.red/tgri","http://ija.twfsj.org/ohyp","http://hyv.mluhk.top/jink","http://yrg.vcdqz.com/gpmp","http://bwl.sdcva.org/lcfe","http://uxu.dupkz.pub/utar","http://hkh.obspi.pub/lyvs","http://opg.bwpaz.edu/wlab","http://lov.ajmpq.xyz/vsfe","http://qbo.fuxgd.org/exez","http://not.gpmxu.org/zkts","http://ixo.zqpeh.com/kryz","http://lsb.szsjm.tech/fotc","http://qrw.tixqt.net/shsp","http://jmn.qhqla.net/ngpm","http://ita.xqdgv.edu/snmz","http://jad.irchi.pub/benm","http://shk.lenqb.red/exqx","http://xwj.opedc.xyz/lwny","http://sns.pcjez.xyz/gzqd","http://xgz.wrmrg.net/fwxi","http://adk.dahmn.top/epkl","http://dex.ujwvq.info/runi","http://evk.dshgz.xyz/wloz","http://tsh.idwrw.xyz/bods","http://gze.vodqf.pub/qbyf","http://jkj.ergpm.pub/fqnc","http://glu.fwxad.edu/ilmr","http://lmv.etmrk.top/fqds","http://ude.hibcn.org/uxql","http://dap.wjilo.info/tqbg","http://ihc.xcpif.pub/alix","http://nur.ofcdi.pub/jgzy","http://sno.lobid.pub/gfih","http://fen.sbolk.ink/zabo","http://eng.hupyn.xyz/qfmp","http://dgn.utetk.info/hafa","http://apo.zwpcv.org/sxez","http://xcf.oxate.tech/hubo","http://ohm.tevwx.pub/ofoj","http://vip.atmpk.red/byje","http://sjc.bklev.red/odmr","http://dyf.elarq.com/xkbu","http://khe.zwdkz.xyz/izyd","http://von.ivklg.org/fgti","http://cdu.zuhkt.red/obud","http://tmb.krkxo.ink/pqdc","http://azs.pcpch.ink/qdwt","http://hon.exmfi.top/hqxw","http://glg.nqdoh.com/olop","http://xqz.opczs.red/tqva","http://uds.dwrod.com/unod","http://dgp.crofk.pub/deti","http://evc.roraf.net/yhal","http://jux.kpwru.top/dwdi","http://qfi.rcbqz.edu/ujaz","http://vgn.ytuvk.pub/fajc","http://qfs.fkrop.red/sbsj","http://tyz.utuxq.pub/fgja","http://apm.dsbap.ink/wpsl","http://zcz.kfwnu.top/jmxs","http://uhk.lonir.info/cdet","http://tih.wdqvk.info/dmzs","http://kne.zcrot.ink/ofez","http://xwr.chmje.org/vwbe","http://ene.rmzin.info/svgn","http://bap.anqvy.ink/vkre","http://ofs.rmrgt.edu/yvkb","http://zoj.wxohi.red/jmnu","http://cvq.lovsv.info/ufyz","http://dqj.qzevk.info/pmla","http://cly.pgrqd.ink/qfox"};
        this.urlMap = urlMap;
    }

    public void setUrls(int[][] edges) {
        // Build the Graph
        constructGraph(edges);
    }

    public List<String> getUrls(String url) {
        List<String> urlList = new ArrayList<>();
        if (webMap.containsKey(url) && !webMap.get(url).isEmpty()) {
            for (VertexInfo v : webMap.get(url)) {
                urlList.add(v.vertexUrl);
            }
        }
        return urlList;
    }

    private void constructGraph(int[][] edges) {
        for (int[] edge : edges) {
            if (!webMap.containsKey(urlMap[edge[0]])) {
                webMap.put(urlMap[edge[0]], new LinkedList<>());
            }
            webMap.get(urlMap[edge[0]]).add(new VertexInfo(edge[1], urlMap[edge[1]]));
        }
    }
    static class VertexInfo {
        private int vertex;
        public String vertexUrl;
        public VertexInfo(int vertex, String vertexUrl) {
            this.vertex = vertex;
            this.vertexUrl = vertexUrl;
        }
    }
}

public class Problem_1242 {
    static class Solver {
        public List<String> crawl(String startUrl, HtmlParser htmlParser) {
            List<String> result = new ArrayList<>();
            // Get the Hostname
            String hostname = getHostName(startUrl);

            Set<String> visited = new HashSet<>();
            BlockingQueue<String> queue = new LinkedBlockingQueue<>();
            Deque<Future<String>> tasks = new ArrayDeque<>();
            queue.offer(startUrl);
            // Create a thread pool of 4 threads to perform I/O operations.
            ExecutorService executor = Executors.newFixedThreadPool(4, r -> {
                Thread t = new Thread(r);
                // Leetcode doesn't allow executor.shutdown().
                // Use daemon threads so the program can exit.
                t.setDaemon(true);
                return t;
            });
            while (true) {
                String url = queue.poll();
                if (url != null) {
                    if (getHostName(url).equals(hostname) && !visited.contains(url)) {
                        result.add(url);
                        visited.add(url);
                        // Use a thread from the thread pool to fetch new URL's and put them into the queue.
                        tasks.add((Future<String>) executor.submit(() -> {
                            List<String> newUrls = htmlParser.getUrls(url);
                            for (String newUrl : newUrls) {
                                queue.offer(newUrl);
                            }
                        }));
                    }
                } else {
                    if (!tasks.isEmpty()) {
                        // Wait for the next task to complete, which may supply new URL's into the Queue
                        Future<String> nextTask = tasks.poll();
                        try {
                            nextTask.get();
                        } catch (InterruptedException | ExecutionException e) {
                        }
                    } else {
                        // Exit when all the tasks are completed.
                        break;
                    }
                }
            }
            return result;
        }
    }
    private static String getHostName(String url) {
        String hostname = url.substring(7);
        if(hostname.contains("/")) {
            hostname = hostname.substring(0, hostname.indexOf("/"));
            return hostname;
        }
        return hostname;
    }
    static class Solver1 {
        private Object lock = new Object();
        public List<String> crawl(String startUrl, HtmlParser htmlParser) {
            if( startUrl == null || !startUrl.startsWith("http://") ) {
                throw new IllegalArgumentException();
            }
            int index = startUrl.indexOf("/", 7);
            String prefix = startUrl;
            if(index != -1)
                prefix = startUrl.substring(0, index);
            Set<String> urlSet = new HashSet<>();
            urlSet.add(startUrl);
            Crawler crawler = new Crawler(lock, urlSet, startUrl, htmlParser, prefix);
            Thread t = new Thread(crawler);
            t.start();
            try {
                t.join();
            } catch(InterruptedException e) {}
            return new ArrayList<>(urlSet);
        }
        static class Crawler implements Runnable {
            private final Object lock;
            private Set<String> urlSet;
            private String startUrl;
            private HtmlParser htmlParser;
            private String prefix;
            public Crawler(Object lock, Set<String> urlSet, String startUrl, HtmlParser htmlParser, String prefix) {
                this.lock = lock;
                this.urlSet = urlSet;
                this.startUrl = startUrl;
                this.htmlParser = htmlParser;
                this.prefix = prefix;
            }

            @Override
            public void run() {
                List<String> urlList = htmlParser.getUrls(startUrl);
                Set<Thread> threads = new HashSet<>();
                synchronized(lock) {
                    for(String url : urlList) {
                        if(url.startsWith(prefix) && !urlSet.contains(url)) {
                            urlSet.add(url);
                            Crawler crawler = new Crawler(lock, urlSet, url, htmlParser, prefix);
                            Thread t = new Thread(crawler);
                            t.start();
                            threads.add(t);
                        }
                    }
                }
                for(Thread t : threads) {
                    try {
                        t.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
}
