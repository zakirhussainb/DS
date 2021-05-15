package com.zakcorp.hackerrank.problemsolving;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciModified_Test {
    FibonacciModified.Solver p = new FibonacciModified.Solver();
    @Test
    public void test1() {
        assertEquals("5", String.valueOf(p.solve1(0,1,5)));
    }
    @Test
    public void test2() {
        assertEquals("84266613096281243382112", String.valueOf(p.solve1(0,1,10)));
    }
    @Test
    public void test3() {
        assertEquals("7434841768682827453969683911079891010742508764892394058388676317503168528947232587724700863682435810754046983862974155281884033540779027921797065323751402841812867284881024311296062346433703276753760259223109762965637650324894057196955392693371540014072079229982197733172025495895463955025003519437397930587745303099007077059964955727159266852216846058761385794217901992910187578077771462497225650306773367574335691626903627522707922987603672546261207749222867925978147688827376339757685621586885386220205811483552897681969671102681754713348387956712872291038261801594863067792782375276323494022709823076733976336989102883523551615626057336538739814343265870121677917110646417633450019741517165078141172041203531983645476263119306709351505396726741101596094463187786816067051569305592401349836745437703329562917327006218048852439546394429697086356515700570162735588671218087112210318265595663612102763710646345522956192260946004853110683740774461178595539214240490087311731137384403817741022979231208457932636070116722515178684627399402468242247013426494213127578508551839563634383576926688708563149505216558497366166286325979139772765729211486932812241798695866534344576009350985605887796446822306032426574810450017552887128866579259149598291152152983378317425437422771345872099621714458840936357309501795029166256144017094619244412180944620834454875969447968397174853988748749616304399428878653259790657979619349556404392172807251966375061675770830661445364022064047577114250820049466708755224760184865050680613236409738999486916103857819905921981156348398929154837899917297880638306587354931916314612769782607049635939965045095617596905894932386136572847236896665346680619789029327312489942785421518912013165693707976164414416358538766047568602751590008561506856437296079320446983282868067426254357749639086843482754174210311201575929299694207201626589301525766781085491160605892958287427837231521112693228890713319198682685821860714353624160328688756218157522439374997884419524434815872969983521632127868779817557535994296160782364883367181246186535831086349817764072026309833387208692760889543612727882273992116655046653471700294939983903381500131561079235648396085846930930051242757110139047122464384783078368357883923898224072930549999479616744791093476988200986100798313902169908056321529255156996520590273383650277471448247338292535243014245789740137670514383116041662063985606179278579341270809135425588288182029811059910373424026767026673563339252219345832820379254017908420231365298221041084616120341913728551660821752988844325334457329836794723745436111075251580109953604272208752183996452673195706507690477595138621878614216699170714253487030078846958581078222936468683332857268883889395484629301671127873171369037450970221942722376257013958084631635198553440883387617754178225951113959634346366993453301563878029363343845874195708440275563158300647728875505192438142698787229468166670818546152101280191126164020240979255269005563141617840639086507812599323336682044474904294339667496429347417319204990738105419183961306265103860459516553243373099223825945876116588041864189868399598897456088183488192098719775714980253398518301282146549358829061091207017257191481885078768628329830071757271666627614895145006473702853553093497866482840876197005921052394250718424144193254371046616686280206088819887902633641709473581716338062591599287867878549651658485984778687788643703245349869967199325991317177760571540430330711620439951917711841083285193734140755949792054998374407328147708220497785950705761569071575091682562133661063141591278924849615946439621062425589843429633107144716920408321767887111707847595060544998456851562372813778849479621844519138680615312749663238634749206236664854128972646576942824255067588442951661192180669095256146889745516543604749957239768915706322286505881767634212171039539339233595237264023111625103275540932952491016050350555815369725909647816977447190307123130310601649893970023792821438938092905870681126311778363870211221010267915755921583758574509514054461323300868445815479384216025958010275300603296196796585963841319881508880579531473874683604282208234486096234308595072685926952754789004415204717073377007947169538550149675441366427182760794788909174549275601117755493977004968340836762276596882906224590378094437064677059890014613662095365660656962004415501103097581122892096133929365824164981766235751028430625573426870834367659420178537267412987467521126850573276209592730279213192325216457494219330797062189195640107976803909415349610101925463752822271405266689639451159355183065542673951575045376892625592551466673949435439455235789867462238573188120866224038783116750825389226512688803772502407521302070943901585048523728301536620130782709767048677463810522870299224578135018286158333342575061496147335843218199326340948591714603877441403637485402497138997807795595965327003306671197536867313883316672264499214248424625470389189786180024565923281113749232566912359417389284302000752564479624133288049418208768415036215678999189626098269860522453440483187675754167706918480743001435188200095847382917788205220129340814530656826394139931085429276740015534120674848927091326736644427108663193400355619845115148312449814965227157188221551703868560315027061560093132888158052647014688509652904415155684931601044733055648248059145849201492560523490054979835665320610478065541356935120765855505502712953860831094950700638808073611266869880606325981210308392494473650885645744216655247144905000564280780653364499000607913673822746395077706096046389351383617805393828055400394053826857497798810871698422739803430099087709128279909514795453571468458925877420216128434945555871148185859394915836735308306657189067742481669962822494874611954847072989696624268589990767932224142426470751921215750937622734332100198482938250909924596391346347923203042933845656250899907915763215508635192565087480276243811085074942626334584837125204684220141427194173873768916940944222518565502284442314391452796273288290638831311288146428656614598078028618261999321654628180367950633878897912322854593693618877377558172591495872338217552261991861407485672751878089464708697766092064338635504652400562666460534640341449962765666280310330198962217583341986113690753647838301040123205828075407048636298224086322757320919596174952132439577558987800510143630362105310867900763259699863506319775588278275561145498044355964511230014669447476957056940162815780341185367131376711386118338457756984885619271985369275128586122421152271085506814390534395522145311405932369787848617999421972951995120300132698552686736499265943746668387057877639665077879380185992327300126042802350672963210939829831627644900968364192349459031115351959705404105975838188139567631355999835360977087725723703196724181858953736837346251933552943320011065810966342271200459063681821219727193197141174655425440804377368641160466647854211027799881871033876965581193703877339375037942644707718240941412976925361029533066151572706576506433895956811095761240375807248593844605631611382152713623721720918745334648745852224832837048549282555561724241807013511427100159586974002645790669310659245661229220461285544900834581811047783271874875955126671535921134962026882101541753609289864086338914867979669870754977007721394319823736009757246815637565183087023553656765114372833663703890459610200761369254702993354423609623142445731442388767384165307770406483019400732184667297544080836326341007144513728164657403953030213456844341039309291826339338472366573955062407904433259475052280987489178992524925968128026340797325165251812799540169360001924028336945910986402717651801813608748361054602667619816800566138060611571575484279293798913000048067481849526203333509051266985457138409555643226070108668144215281831214617423529149667056452118678065414688818618602011942855488793301474174395399551076950672667116625047098344479013720769784222187795495673069476119452066699114789055480758810852231518055380430350007559392986079057910188808467690143214387753594981490845703069677438316329685216392690361585732412012611659424831551299048348441721859550160125564548140626565498002426735681807850591315072343305620281164288505422448681452128353893751777479345324957418546918543247893065715848202414779625675067503195049194314105584907712718566320528724633494393542888736015608676255394435605239701086061601413733261697541613865365010983091019311099440026462519452158422590479025930329536949975070236412312476534057032479388256588717977585501728855814936091096482249279322399262984425094966470583028112516365094705843808308910709862772068970261649320596512376433318507447435934733158184975540388020562739149099257804190368798627064248441905285482655009484422427877474052024125858098934170895294130785257272757914936161086365087007535682295506936046842168173220454407459355242853249003210549279382475569790372850816831355693624641732699555220622384369354168297813083023734281765706107033967848981628001880081609458620263779287286895888019977618618643600510811750001886000539801507937359787411628134229527098403233440890085321883711388521828970409447740985103076942189633005589539274047297998215690704044510826454346261327148501867127336559638281176396694618845144506864382416112059712767204851406846326719177097085051520711347673537485055529181621473165557879482192608231759756645960483025490527514080038195287249378541854525927912287342426075025086588694570196467481285438610851924316287848033530313108170991373929389854442159133676894697034028222288618726075090761505827037827447053356967429504029988424217197174544920543378350701498841664286999645321327673596092871584475506494640596314628719493573211176530583097253870292842534220301800611416406407355226768917736619670604061505148402200416210279211653512052362741210420299902221105499553959049335263649415915857174801401090764782752707388514111278807916685377822800517919254739408315450043507078610265499514533417073581781147111423600105710342680201277743784931713042250584343519663894051120644865673589985978206354759862736180780803906603807781049739516113830385860191987896435871810650303911331152819116364294974986178379846898973875021463912954873536633917690904097776630456719821598351499311772107471490868122455568566301288785612101951271502288157572703001332552260623084047360767483335721501063563723131572613796783628703766836973045732537322007735088809036113406276347995780112831141062587140834967895958627813129799484716750021192422773926418504619487923985361704881717097368049963873448417432054484124113831860532868676732970424248972088857945131693084169811632536017659597977806922911524993277461996128698857747151405351094580712826647633130943730229044022875687950617070419338595033296913637888135316490661668999837753910108178473900044554834900646252620488322388651066072159196658674974835580897073451856435437808944303272104784860141785725096430971995912023040202514811313430962340020205290333723368666165934414033073270390525453584953534180855837404835577438264788376932863815725699851604919667959910492702490822647565043955350285211500728998559914780484226203817098213824056835081298933784496180281235847273315236470435723124903850152158644500327520543619800254780775515457209299379689737000789119512925577463740395182558742972334773693391960299768647645375619955901560362785439946787583589272502340124700788673887469275033426162539830045697720840909493958288130099899896875921623207468027145690611763193301514784007857881066333061904906508550712686713912594114952311203793843780889245914092153004558189146503217604856803403929744484849873596197926023039581847656522093491293381198580885991531936929391951141376082974722593992393399951804667441097228714133342060189467585288754435486915507178630331631879141163039326380927908602900164210985722182022584042592318088787838758487995853120571433610791081031907384314302608602987867535065811311041979082613853953758972181900098778907580568121980576015871335461146083105407761087438651043265707731703338220678064582410247397886401271346139021107228416934010201246546580149359633325931363140989327863961578628162243083487510322550480762914847168416120140677627107712283049751793124873186721836162563357054919646475048776869879632862737485175322933212319795184679779597734166233210396289754292516368855078831495040496406554038346594913324175251666404523375306709356615525848399283828773750204863119024425813487020284175273856223836212428043036332786207307167064495161234541943874109206828312530263034512028286269730775118534625386276802622243993262966188509353749785252203150639864140940880365898575715164077551701592883243374725567789621398815299834566710289708083750653953351832581478940896890969029268336526488503715921431250113810097067769493652445578350175273688342648518301560055785053399049087826123652419577420014587828631609070938206057077639006540767046927113589884876716955821359284482755061125585587213824228259785501994400008508683718512479678966351585750698988362857431146027170022646577894961342777121041449170530814826431120184745033750006886513124532324474003193238307727294421221897172758345064414698459407337759238503846247889442949353394588889642231718870897013756471371603051410788085204553016438115733493303743819119365185460632815028846027906419081109808986585637282368159880588165151026707956825916493528671718215094198208799004384694146888201514405301964720342997442695801357664665810749374846151780061542598681260503541973826574375464839545422523248888966552384682108176190562519784760234216824610841909936750776737443632719637095931754997297903301029508437250807551088721037954791145728507338862597739178341949090287761806164869974957227814207366765069045843167971968773793688889624428841637396413749411122693624108202882677043575584477427852579667218209089747231527625199771980080574727870493990808408661448490974924056931486684769841679024519830953185744197468992918251619285977932236176931281047483313698457987080317400308929426842893400331871244010137087127604181987713699156205307139126157200743467652832900919067991264713589916719203471375049027140868038563435002908111243130185606101965411504384111147302566191339500596146680219612008330841796901268162717877658703895354375349394480739254873621782747588466026539288090699694109353470105259387093645688380405042726299637640665272772450205818895192266575214136514035074277083893140623230270650762823645535083327444649817462304839606281855438053944482138988264613915331025059676396170861497252178722526762068005539231610070721111096947883140547580893310813260646882752464773602220937539883754131623279493708492776127977053770223156570242840913091467323276701592442722761866281136512658054596041414972408092504159823489566060902003997557676497721343224339204033382620269920020610157250020972052986453757058712298293333156387579775029013381101490259446729865917734895805174539023793831666596108909293276531861854313623307991151641351998513116052857428059348215737460709748272758201647733842779171740818869785973100170015827953910021879840692405424059357686832149962887665279840727851983754190475135029101137593493785900857254233255170380688837758604446876700451979769632442445094157098105102924235451494836335467188873050219061548570070999191125933410624177755568849377499146633616228476934085838182727692794839600592922520889233776018837022885776751395793425255475957927327487016189696220564882517800833380930557581670757072256511450525734730638818324313192398477356268920924390131627798540801160836743086394430121733741052789350106297803574058029370089463453887900982856015384733862979739753794022746590091767672089718509159352369308423069296811939295172105070799450654986174355853662072418339148560461793831827770512171377012273585122235575153804393319675635471349936783520860504643568373787692346725619548263011350187162815346608125949332979999617080315623081138979415990168935085117480572667077081351393887476808121698474894129378638342806386809682652960380111848142942150286381770497030221184957626355416895393881482718257919998082364819502343241331303656916111734768949189483448239725770781166491190548449623725961012368660956064972948323509235549972606065185998308115056581500076099483938736508597880751039314197093021401495295226990759165979406780810070680462755171674031507553859486236905793600428947705603194133215667368720814230243519969580472659935477547501209127663004173609574946706488804028190626768563975795793093230287285368946625813586710340122878085309814563984901881970443465803708985298242004907101365944277381801580465124897037113713371318979304108032632354784397153887161884918300558486163971295995661460056129365997642977856883583891633084432206744448395208965101892226869901135206538542007673496835076816851238314177902496659972252068491314798679416605286491133279958893316306407171789126733124639806365216830129728834177304367172908226475656611956182296160745515893909529773769518416356368703836330504535995894349770249012244881293291136962121455037515106323467599276143860947757757249753886702450505292565388293045400179534825456359485656918517095005776333434240958273024509048674277745810739620977936424089700175702811946982497653585527464218517948451408574102411837468452001358691157121211471772813571575432565435094545950134639993527208557078197552063792187048402213817214458804160598227631959209325855537561163462132083810188817979792097556811908639225709699344071455314856148951233873500058677457358813002051893724686411774208940437155142445063482208265201144126123086397187708575209051009400255067682095694094739191160398601090375575851766311872545748944772638574214202924531050581355790581327251527805246311836147126736105308120079942878973457547123265604757662275852311027090052826989259371385644066122805161288621668969560977444626043892901714923637043292363479767601742816182484652286204577200347928636843248783319905226505135572596069965419573693592767083003915131920143795615603749578667993723756646034419046638645564706212766123564220165496273503414339102120594576615130934844217029954742890969371185836788574308236934086825804527347522763268238866552590596262790308974123132987095132347164463869138217178281783975738525496475978264893405590145377164913084587020348418812808725253252957622687977643453377827942705022389691241939624959178340410231915677306413555344585677153399930830280909597677978240787541163971862015441986706883113657755557495969623329401637226371209605634179674707431210785494341423935683589045432063416219355966633414281466308051342841689158758688637342225728164041270023051171398186032707961434156745878662922310815678687473198022287491901727456758751088364277559179062596696346070014671069870778742273867126401017219518732488684427712054959199292033081048179348520431056962970046653069104521157288664721876180059493000392728130872497705549642166758890590272731235477547640055035991666985646664981242054766383381682425713143678281260911598774034952733417063390412383450413193632033079388437222736695939770731905192358546997021258326365035521210956988568898380623936876079226695880018985816116695069215445882728985371799273147618245652843630297491610275330735717057561111600740515518783222586602010862080694668020127524368201796816975071471943699152667095039768873461613020741140657589573992781582075401132806184365580882142907458760666218492801402660641834945973253462735332928087311397493696802179645895303247244487563761902898250152146558629533486889742447017819300223941244744497766079257382102981483880831922404611945555461097118488334783906069241524606310034431153588045597505654978810789937304056838491939269357918086933484894815120100313643495587127505380695503539517180831110112327547298510837535729062668880589749905262323250315783410958201943373982361018244995809011335619629199927758248430897617033584937244892246242507178795059304003850050460485411591613537894447872688581156122087055735144439946045944881562717340861751468828110161537706798756114121667923827540306282400407984494174256233053435543777982598924153862595318368853151624081855598000795238012187937150952344584157251431971163850819557429572280631727191130693872782363517656176478061783119247768783758201887314186441324541400550691140238460654931443322904887742202986171617902543515329370483025727283962543983150121514669615261808950148335311829963882707273292590893220646334761565057240645639061796737627812433901792471088259211575036259538683891269863652133966593488345958771091716037262095627076893939881226043507870387734484245878748551225367351074259768098549928179256596680796640764327853870942595630915405846708508087993176746816723201634092281814116234611688207986930915031536221526148969713692262087880253214273966488665349682045531980000297895883640577569663921118182342954126332687630803305953838713964332114677214184691624255646904327996149457412703868462821255031348724758262215349017174145143741859104471352315192052839644665235514169423158314470619194193727495327809916035647060599608544838960881545501359375813046239699858937940576099697786067279951997166056974785479967771211052512036132022348486297822042322570892000074644884790774220101169743958302693781019870375988816938316867641318323864302821857686193298963653366102443388070291115369461903308190029308044843385283015205685975427359447241913109360983554132302712662216307103911213581812277944213385628303865758585560207291361149078208301509559838954027737892889210127097252713396348568950317606292574780361850548363754807479172728306628596624489926966355275990005260614987269665560636066950232215173804854411385135060275227786194880191254432404000290953422649321338545512503371329289746097088645383384468690515512667017373351742884216221546604443858813109487883104473340975325219473985915666058236641878855803085032927031304821557670830019209667510177108729409380495935129050690735694581535070522977542509055795104882962613616972315011493137296765046641114067261927825609620365694081311972717579290103048225098177707550799834232357732050072611738672500384942751740292530828268276016957680621813759069036150245553632700457497429135871579716184915709074039012563215447451766037078232831164422185596060420711639137705482126391069116233968875256850590663879272742331816452985148018782643523851401352337972335505412670756324412168388512374952179510979988016997284337289009620462976714606104764557314551545801504672510685534639808802208142901286806275198602186333441615603473960537932236071068977407951316827262204054334519367943531952195005624887975832999008807848338574572989510836153099220072709325725285638753798502746110196558007362843718997137925278452696191862112525468092235859341366607897189301672271606900058235267413115476570481746682161909521604836808678956438957864607613944033751418484049757561300328370498303318440185195271712025076333294573766727360555115185155186573019815459344975207477752059024489355593034113001046761951910898967703444348662589785960202247484278547459995952440995198149243592231280471865847230170433300070220390439284179019072033941025767282592777288659049111294992748093357386146345623020965617078344771900149412514213078324845952657691878152371467310014164832477848482689051980041199261368619152674304062206466296784075718798678478040295331444377949936444481880377053615740107456821396252735592161260208239615075889013270384699690817944658021162813344403062432491747268015734910019464756434707611429827231890760022642320720588578299612241614106643972521612464416302440615368872683817956863145278652160298173866275629680922440853346902520119099200063673856684187921169015235385849719578973054519607129027386425639411502600096923237548729329676666152519402964330343871",
                String.valueOf(p.solve1(0,1,20)));
    }
    @Test
    public void test4() {
        assertEquals("112763264", String.valueOf(p.solve1(2,1,7)));
    }
}
