import java.util.Stack;

public class demo_stack {
    public static void main(String[] args) {
        /**
         *      stack = LIFO data structure. Last-In First-Out
         *              stores object into a sort of "vertical tower"
         *              push() to add to the top
         *              pop() to remove from the top
         */

        Stack<String> stack = new Stack<String>();
//        System.out.println(stack.empty());
        stack.push("LOL");
        stack.push("PUBG");
        stack.push("Valorant");
        stack.push("Dota 2");
        stack.push("CS:GO");
//        String myFavGame = stack.pop();
//        System.out.println(stack.empty());
//        System.out.println(stack);
//        System.out.println(myFavGame);
//        System.out.println(stack.peek());
//        System.out.println(stack.search("Valorant"));
        System.out.println(stack.search("sss"));

        /**
         *      uses of stacks?
         *      1. undo/redo features in text editors
         *      2. moving back/forward through browser history
         *      3. backtracking algorithms (maze, file directories)
         *      4. calling functions (call stack)
         */
    }
}
