public class stack {
        int[] stck = new int[1000];
        int tos;
    
        // конструктор инициализирует вершину стека
        stack () {
            tos = -1;
        }
    
        // разместить элемент в стеке
        void push (int item) {
            if (tos == 199)
                System.out.println("Стек заполнен.");
            else
                stck[++tos] = item;
        }
    
        // извлечь элемент из стека
        int pop () {
            if (tos < 0) {
                System.out.println("Стек не загружен.");
                return 0;
            }
            else
                return stck[tos--];
}

    public static void main (String[] args) {
        stack mystack1 = new stack();
        stack mystack2 = new stack();

        // разместить числа в стеке
        for (int i = 0; i < 100; i++)
            mystack1.push(i);
        for (int i = 0; i < 200; i++)
            mystack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Содержимое стека (mystack1):");
        for (int i = 0; i < 100; i++)
            System.out.print(mystack1.pop() + " ");

        System.out.println("\nСодержимое стека (mystack2):");
        for (int i = 99; i < 200; i++)
            System.out.print(mystack2.pop() + " ");
    }
}
