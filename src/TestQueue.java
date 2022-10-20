import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class TestQueue {
    public static void main(String[] args) {
        String[] menu = {"enqueue", "dequeue", "exit"};
        String option = "", all = "";
        Queue q = new Queue(10);


        q.enqueue(14);
        q.enqueue(24);
        q.enqueue(46);
        q.enqueue(16);
        System.out.println(q.peek());


//        do {
//
//            all = "Empty\t: " + q.isEmpty() + "\tFull\t: " + q.isFull() +
//                    "\nCapacity\t: " + q.getCapacity() + "\tCurrent Size\t: " + q.getCurrentSize() +
//                    "\nPeek\t: " + q.peek() + "\tLast\t: " + q.last() +
//                    "\nElements\t: " + q.display() + "\nSelect";
//
//            option = JOptionPane.showInputDialog(null, new JTextArea(all), "menu", 1, null, menu, menu[0]).toString();
//
//            switch (option) {
//                case "enqueue":
//                    if (!q.isFull()) {
//                        try{
//                            int value = Integer.parseInt(JOptionPane.showInputDialog(null, "input integer: "));
//                            q.enqueue(value);
//                            JOptionPane.showMessageDialog(null, value + " added to queue");
//                        }catch (NumberFormatException e) {
//                            JOptionPane.showMessageDialog(null, "invalid input");
//                        }
//                    }else {
//                        JOptionPane.showMessageDialog(null, "queue is full");
//                    }
//                    break;
//
//                case "deque":
//                    if (!q.isEmpty()) {
//                        JOptionPane.showMessageDialog(null, q.deque() + " removed from queue");
//                    }else {
//                        JOptionPane.showMessageDialog(null, "queue is empty");
//                    }
//                    break;
//            }
//
//        }while(!option.equals("exit"));
    }
}
