public class Queue {
    private int[] num;
    private int top, rear, capacity;

    public Queue() {
        this(5);
    }

    public Queue(int capacity) {
        this.capacity = capacity;
        num = new int[this.capacity];
        top = rear = 0;
    }

    public void enqueue(int data) {
        if (!isFull()) {
            num[rear] = data;
            rear++;
        }else {
            System.out.println("Queue full!");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int hold = num[top];
            for (int i = 0; i < rear - 1; i++) {
                num[i] = num[i + 1];
            }
            if (rear < capacity) {
                num[rear] = 0;
            }
            rear--;
            return hold;
        }else {
            return -1;
        }
    }

    public String display() {
        if (!isEmpty()) {
            String hold = "";
            for (int i = top; i < rear; i++) {
                hold += num[i] + " ";
            }
            return hold;
        }return "";
    }

    public boolean isEmpty() {
        return top == rear;
    }

    public boolean isFull() {
        return rear == capacity;
    }

    public int frontValue() {
        return num[top];
    }

    public int rearValue() {
        return num[rear];
    }

    public int peek() {
        if (!isEmpty()) {
            return num[top];
        }return -1;
    }

    public int last() {
        if (!isEmpty()) {
            return num[rear - 1];
        }return -1;
    }

    public int count() {
        return rear;
    }

    public int getCurrentSize() {
        return count();
    }

    public int getCapacity() {
        return capacity;
    }

}
