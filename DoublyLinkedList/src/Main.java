import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        DoublyLinkedListClass list = new DoublyLinkedListClass();
        String choice;
        int myVal, myData;
        while(true) {
            System.out.println("_______________________________________________");
            System.out.println("1.  Insert Head        | 8.  Display Forwards");
            System.out.println("2.  Insert Tail        | 9.  Display Backwards");
            System.out.println("3.  Insert Before      | 10. Display Previous");
            System.out.println("4.  Insert After       | 11. Display Next");
            System.out.println("5.  Delete Certain Key | 12. Display Head");
            System.out.println("6.  Delete Head        | 13. Display Tail");
            System.out.println("7.  Delete Tail        | 14. Search");
            System.out.println("_______________________________________________");

            Scanner scan = new Scanner(System.in);
            System.out.print("\nEnter choice: ");

            choice = scan.nextLine();
            switch (choice) {
                case "1":
                    Scanner insertHead = new Scanner(System.in);
                    System.out.print("      Enter a value to insert: ");
                    myVal = insertHead.nextInt();
                    if(list.insertFirst(myVal))
                        System.out.println("      "+myVal+" inserted!");
                    else
                        System.out.println("      "+myVal+" couldn't be inserted(no dupes allowed)!");
                    break;
                case "2":
                    Scanner insertTail = new Scanner(System.in);
                    System.out.print("      Enter a value to insert: ");
                    myVal = insertTail.nextInt();
                    if(list.insertLast(myVal))
                        System.out.println("      "+myVal+" inserted!");
                    else
                        System.out.println("      "+myVal+" couldn't be inserted(no dupes allowed)!");
                    break;
                case "3":
                    Scanner insertBefore = new Scanner(System.in);
                    System.out.print("      Enter a value to insert before: ");
                    myVal = insertBefore.nextInt();
                    Scanner insertBeforeVal = new Scanner(System.in);
                    System.out.print("      Enter a value to insert : ");
                    myData = insertBeforeVal.nextInt();
                    if(list.insertBefore(myVal,myData))
                        System.out.println("      "+myData+" inserted!");
                    else
                        System.out.println("      "+myData+" couldn't be inserted(no dupes allowed/improper value to insert before)!");
                    break;
                case "4":
                    Scanner insertAfter = new Scanner(System.in);
                    System.out.print("      Enter a value to insert after: ");
                    myVal = insertAfter.nextInt();
                    Scanner insertAfterVal = new Scanner(System.in);
                    System.out.print("      Enter a value to insert : ");
                    myData = insertAfterVal.nextInt();
                    if(list.insertAfter(myVal,myData))
                        System.out.println("      "+myData+" inserted!");
                    else
                        System.out.println("      "+myData+" couldn't be inserted(no dupes allowed/improper value to insert after)!");
                    break;
                case "5":
                    Scanner delete = new Scanner(System.in);
                    System.out.print("      Enter a value to delete: ");
                    myVal = delete.nextInt();
                    if(list.delete(myVal))
                        System.out.println("      "+myVal+" deleted!");
                    else
                        System.out.println("      "+myVal+" couldn't be deleted!");
                    break;
                case "6":
                    if(list.deleteFirst())
                        System.out.print("      Head deleted! ");
                    else
                        System.out.print("      No head to delete! ");
                    break;
                case "7":
                    if(list.deleteLast())
                        System.out.print("      Tail deleted! ");
                    else
                        System.out.print("      No tail to delete! ");
                    break;
                case "8":
                    System.out.print("        List forwards: ");
                    list.displayListForward();
                    System.out.println(" ");
                    break;
                case "9":
                    System.out.print("        List backwards: ");
                    list.displayListBackward();
                    System.out.println(" ");
                    break;
                case "10":
                    Scanner dispPrev = new Scanner(System.in);
                    System.out.print("      Enter a value to display previous for: ");
                    myVal = dispPrev.nextInt();
                    System.out.println("      "+"The value before "+myVal+" is "+list.displayPrevious(myVal)+"(-1 = no value)");
                    break;
                case "11":
                    Scanner dispNext = new Scanner(System.in);
                    System.out.print("      Enter a value to display next for: ");
                    myVal = dispNext.nextInt();
                    System.out.println("      "+"The value after "+myVal+" is "+list.displayNext(myVal)+"(-1 = no value)");
                    break;
                case "12":
                    System.out.print("        List head: "+list.displayHead()+"(-1 = no value)");
                    System.out.println(" ");
                    break;
                case "13":
                    System.out.print("        List tail: "+list.displayTail()+"(-1 = no value)");
                    System.out.println(" ");
                    break;
                case "14":Scanner search = new Scanner(System.in);
                    System.out.print("      Enter a value to search for: ");
                    myVal = search.nextInt();
                    if(list.search(myVal))
                        System.out.println("        "+myVal+" Found!");
                    else
                        System.out.println("        "+myVal+" Not found!");
                    break;
                default:
                    continue;

            }
        }
    }
}
