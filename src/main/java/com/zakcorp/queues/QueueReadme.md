Queue data structure has the following implementations:-
1. **_Implementation of a Queue using Single Pointer_**
    * It is implemented using array.
    * The size of the array can be fixed, lets say 7 or we can
    initialize it during runtime.
    * Here we have only the rear pointer.
    * For insertion,
        * Insert from the rear end.
        * So insertion takes _O(1)_ time.
    * For deletion, 
        * Delete the element at the first position.
        * Shift the elements from the right to the empty position.
        * Then finally decrement rear.
        * So deletion takes _O(n)_ time.
    * Drawbacks,
        * The size of array is fixed.
        * Deletion takes _O(n)_ time.
2. **_Implementation of a Queue using two Pointers_**
    * It is implemented using array.
    * The size of the array can be fixed, lets say 7 or we can
    initialize it during runtime.
    * Here we have two pointers front and rear.(front == rear == -1)
    * For insertion,
        * Insert from the rear end.
        * So insert takes _O(1)_ time.
    * For deletion,
        * Delete from the front end.
        * Increment the front pointer and delete the element.
        * So deletion takes _O(1)_ time.
    * _isEmpty()_ condition,
        * if (front == rear), then queue is empty.
    * _isFull()_ condition,
        * if (rear == size - 1), then queue is full.
    * Drawbacks,
        * We cannot reuse the spaces of the deleted elements.
        * Queue is empty and as well as full, for the edge case
            where (front == rear == 6), when size = 7
    * Solutions to avoid these drawbacks,
        * Resetting the pointers,
            * At any point when queue becomes empty, bring the front and
            rear point at the beginning. i.e. (front == rear == -1).
            * But still we have to wait till the queue becomes empty to
            implement this solution.
        * Using circular queue.
3. **_Implement of Queue using Circular Queue_**
    * It is implemented using Array.
    * The size of the array can be fixed, lets say 7 or we can
    initialize it during runtime.
    * Here front and rear move circularly, (front == rear == -1).
    * For insertion,
        * Insert from the rear end.
        * So insert takes _O(1)_ time.
        * `enqueue(E data):
            if(isFull())
                print "Queue is Full";
            else
                if(front == -1)
                    front = 0; rear = 0;
                else if(rear == SIZE - 1 && front != 0)
                    rear = 0;
                else
                    rear++;
                elements[rear] = data;      
        `
    * For deletion,
        * Deletion is from front end.
        * So deletion takes _O(1)_ time.
        * `E dequeue():
            E data = elements[front];
            if(isEmpty())
                print "Queue is Empty";
            else
                if(front == rear)
                    front = -1, rear = -1;
                else if(front == SIZE - 1)
                    front = 0;
                else
                    front++;
            return data;
            `
        * _isEmpty()_ condition,
            * if (front == -1), then queue is empty.
        * _isFull()_ condition,
            * if (rear == size - 1 && front == 0) || (front
            == rear + 1), then queue is full.
  
4. **_Implementation of Queue using LinkedList_**
    * Implemented using LinkedList.
    * So the size of the queue is dynamic.
    * It has three nodes, front, rear and next nodes.
    * Insertion happens at the rear end and deletion happens at the rear end.
    * For insertion,
        * Create a new node _t_.
        * Check if front is null and point _front_ and _rear_ to _t_.
        * Move rear->next to t and point rear at t.
        * It takes O(1) time.
    * For deletion,
        * Check if Queue is empty, if(front == null).
        * Move front to front.next
        * It takes O(1) time.
    * _isEmpty()_
        * If front is null.
5. **_Double Ended Queue - DEQueue_**
    * _Input Restricted DEQueue_
        * Using Array
            * _insertFromRear()_
            * _deleteFromRear()_
            * _deleteFromFront()_
        * Using LinkedList
            * _insertFromRear()_
            * _deleteFromRear()_
            * _deleteFromFront()_
    * _Output Restricted DEQueue_
        * Using Array
            * _insertFromRear()_
            * _insertFromFront()_
            * _deleteFromFront()_
        * Using LinkedList
            * _insertFromRear()_
            * _insertFromFront()_
            * _deleteFromFront()_
6. **_Priority Queue_**
    * Limited set of Priorities
    * Element based priorities