import com.example.alrijneziekenhuisapp.Maaltijd;
import com.example.alrijneziekenhuisapp.Menu;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    void keuzesDrinken() {

        // Arrange
        Menu.getKeuzesDrinken();
        ArrayList<Maaltijd> testDrinkenLijst = new ArrayList<>();
        for (int i = 0; i < Menu.getKeuzesDrinken().size(); i++) {
            testDrinkenLijst.add(Menu.getKeuzesDrinken().get(i));
        }
        // Act
        ArrayList<Maaltijd> result = Menu.getKeuzesDrinken();

        // Assert
        assertEquals(testDrinkenLijst, result);
    }

    @Test
    void keuzesExtra() {

        // Arrange
        Menu.getKeuzesExtra();
        ArrayList<Maaltijd> testExtraLijst = new ArrayList<>();
        for (int i = 0; i < Menu.getKeuzesExtra().size(); i++) {
            testExtraLijst.add(Menu.getKeuzesExtra().get(i));
        }
        // Act
        ArrayList<Maaltijd> result = Menu.getKeuzesExtra();

        // Assert
        assertEquals(testExtraLijst, result);
    }

    @Test
    void keuzesOchtendEten() {

        // Arrange
        Menu.getKeuzesOchtendEten();
        ArrayList<Maaltijd> testOchtendEtenLijst = new ArrayList<>();
        for (int i = 0; i < Menu.getKeuzesOchtendEten().size(); i++) {
            testOchtendEtenLijst.add(Menu.getKeuzesOchtendEten().get(i));
        }
        // Act
        ArrayList<Maaltijd> result = Menu.getKeuzesOchtendEten();

        // Assert
        assertEquals(testOchtendEtenLijst, result);
    }
}