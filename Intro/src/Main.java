import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final String delimiter = "\n----------------------------------\n";
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.print(i + "\t");
//        }
        System.out.println();
        boolean condition = true;
        //System.out.println(condition);
        //System.out.println(Boolean.TYPE);


        //System.out.println(Character.TYPE);
        System.out.println(Short.TYPE);
        System.out.println(Short.SIZE); //Размер в битах
        System.out.println(Short.BYTES);//Размер в Байтах
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println();
        /// ////////////////////////////////////////////////////////////////////////////////

        System.out.println("ЦЕЛОЧИСЛЕННЫЕ ТИПЫ:");

        System.out.println
                (
                        "Переменная типа %-7s занимает %d Байт памяти (%d бит памяти), и принимает значения в диапазоне от %d до %d".
                                formatted("byte", Byte.BYTES, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE)
                );

        System.out.println
                (
                        "Переменная типа %-7s занимает %d Байт памяти (%d бит памяти), и принимает значения в диапазоне от %d до %d".
                                formatted("short", Short.BYTES, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE)
                );

        System.out.println
                (
                        "Переменная типа %-7s занимает %d Байт памяти (%d бит памяти), и принимает значения в диапазоне от %d до %d".
                                formatted("int", Integer.BYTES,Integer.SIZE,Integer.MIN_VALUE,Integer.MAX_VALUE)
                );
        System.out.println
                (
                        "Переменная типа %-7s занимает %d Байт памяти (%d бит памяти), и принимает значения в диапазоне от %d до %d".
                                formatted("long", Long.BYTES,Long.SIZE,Long.MIN_VALUE,Long.MAX_VALUE)
                );
        System.out.println("ВЕЩЕСТВЕННЫЕ ТИПЫ:");
        System.out.println
                (
                        "Переменная типа %-7s занимает %d Байт памяти (%d бит памяти), и принимает значения в диапазоне от %e до %e".
                                formatted("float", Float.BYTES,Float.SIZE,Float.MIN_VALUE,Float.MAX_VALUE)
                );
        System.out.println
                (
                        "Переменная типа %-7s занимает %d Байт памяти (%d бит памяти), и принимает значения в диапазоне от %e до %e".
                                formatted("double",Double.BYTES,Double.SIZE,Double.MIN_VALUE,Double.MAX_VALUE)
                );
        System.out.println(delimiter);
        /// ///////////////////////////////////////////////////////////////
        System.out.println("КОНСТАНТЫ:");
        int speed = 0;
        final int MAX_SPEED=250;

        System.out.println(((Object)512).getClass().getSimpleName());
        System.out.println(((Object)512.f).getClass().getSimpleName());
        //System.out.println(0b11001000);

        /// //////////////////////////////////////////////
        System.out.println("Ввод с клавиатуры:");
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите значение");
        //int a = kb.nextInt();
        //System.out.println("Вы ввели значение " + a);
        //System.out.println(5.5%2);

        System.out.println("Введите направление: ");
        String direction = kb.nextLine();
        switch (direction)
        {
            case "left":
                System.out.println("Идем налево");
                break;
                case "right":
                System.out.println("Идем направо");
                break;
                case "forward":
                System.out.println("Идем вперед");
                break;
                case "backward":
                System.out.println("Идем назад");
                break;
            default:
                System.out.println("Ошибка ввода");
        }
    }
}