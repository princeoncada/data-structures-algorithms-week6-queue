public class test {
    public static void main(String[] args) {
//        int numS[] = {2,18,32,19,-5};
//        int numQ[] = {-2,4,13,24,15};
//
//        MyStack st = new MyStack(10);
//        Queue q = new Queue(10);
//
//        for (int i = 0; i<numS.length; i++){
//            st.push(numS[i]);
//            q.enqueue(numQ[i]);
//        }
//
//        int val = 0;
//        for (int i = 0; i <numS.length; i++){
//            val = st.peek();
//            if (val < 0) {
//                q.dequeue();
//                st.pop();
//            } else if (val < 10) {
//                q.dequeue();
//                q.enqueue(val);
//            }else {
//                val = st.pop();
//                q.enqueue(val);
//            }
//        }
//
//        System.out.println(st.display());
//        System.out.println(q.display());
//

//        MyStack st = new MyStack(5);
//        int x = 5, y = 3;
//        st.push(4);
//        st.push(x);
//        st.push(x+1);
//        y = st.peek();
//        st.pop();
//        st.push(x +y);
//        x = st.pop();
//        st.pop();
//        System.out.println( x + " " +  y);

        int num[] = {2,18,32,19,-5,45,56,90,45,34,2,5,6,-5,32,45,56,2};

    }
    public static String reverse(Stack extra){
        String rev="";
        int top = extra.top();
        for(int i=0; i<=top; i++) {
            rev += extra.pop() + " ";
        }
        return rev;
    }

}
