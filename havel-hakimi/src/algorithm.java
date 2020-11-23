import java.util.ArrayList;
import java.util.Collections;

public class algorithm {
    private ArrayList<Integer> list = new ArrayList<>();
    public void addPeople(int person) {this.list.add(person);}
    public void deletePeople(int index) {this.list.remove(index);}
    public boolean havelHakimi() {
        Collections.sort(this.list);
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i) == 0) {
                this.list.remove(i);
                System.out.println("bye 0");
                printList();
            }
            this.list.trimToSize();
        }
        if (this.list.isEmpty()) {return true;}
        Collections.reverse(this.list);
        int N = this.list.get(0);
        this.list.remove(0);
        this.list.trimToSize();
        // Si N es mayor que la longitud de esta nueva secuencia (es decir,
        // elcalentamiento 3), regresa falso.
        if (N > this.list.size()) {
            return false;
        }
        // Reste 1 de cada uno de los primeros elementos N de la nueva
        // secuencia(calentamiento 4).
        for (int i = 0; i < N; i++) {
            this.list.set(i, this.list.get(i) - 1);
        }
        printList();
        havelHakimi();
        return true;
    }
    public void printList() {
        System.out.print("LISTA: ");
        for (Integer integer : this.list) {
            System.out.print((integer.toString()) + " ");
        }
        System.out.println("\n ----- ");
    }
}
