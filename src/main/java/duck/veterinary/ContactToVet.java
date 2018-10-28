package duck.veterinary;

import java.util.Date;
import java.util.zip.DataFormatException;

public class ContactToVet {
    private Vet vet;

    public void callVet() {
        System.out.println(new Date());

        if (vet == null) {
            vet = new Vet();
        }
        vet.answerPhone();
    }
}
