import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VirtualPetTest {
    @Test
    public void shouldBeHungry() {
        VirtualPet pet = new VirtualPet(0, 45, 100);
        boolean hunger = pet.isHungry();
        Assertions.assertTrue(hunger);
    }
    @Test
    public void shouldBeThirsty() {
        VirtualPet pet = new VirtualPet(40, 0, 100);
        boolean thirst = pet.isThirsty();
        Assertions.assertTrue(thirst);
    }
    @Test
    public void shouldNeedToUseBathroom() {
        VirtualPet pet = new VirtualPet(40, 45, 89);
        boolean waste = pet.needToWaste();
        Assertions.assertTrue(waste);
    }
    @Test
    public void isHungerCorrect() {
        VirtualPet pet = new VirtualPet(40, 45, 22);
        int hunger = pet.getHunger();
        Assertions.assertEquals(40, hunger);
    }
    @Test
    public void isThirstCorrect() {
        VirtualPet pet = new VirtualPet(40, 45, 22);
        int thirst = pet.getThirst();
        Assertions.assertEquals(45, thirst);
    }
    @Test
    public void isWasteCorrect() {
        VirtualPet pet = new VirtualPet(40, 45, 22);
        int waste = pet.getWaste();
        Assertions.assertEquals(45, waste);
    }
    @Test
    public void wasFeedSuccessful() {
        VirtualPet pet = new VirtualPet(40, 45, 22);
        pet.feed();
        int hunger = pet.getHunger();
        Assertions.assertEquals(20, hunger);
    }
    @Test
    public void wasDrinkSuccessful() {
        VirtualPet pet = new VirtualPet(40, 45, 22);
        pet.drink();
        int thirst = pet.getThirst();
        Assertions.assertEquals(15, thirst);
    }
    @Test
    public void wasWasteSuccessful() {
        VirtualPet pet = new VirtualPet(40, 45, 22);
        pet.relieve();
        int waste = pet.getWaste();
        Assertions.assertEquals(0, waste);
    }
    @Test
    public void didTheCorrectTIme() {
        VirtualPet pet = new VirtualPet(40, 45, 22);
        pet.tick();
        int timePassed = pet.getTimePassed();
        Assertions.assertEquals(1, timePassed);
    }
}
