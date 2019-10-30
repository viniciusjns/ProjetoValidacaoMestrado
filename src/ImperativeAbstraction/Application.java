package ImperativeAbstraction;

public class Application {

    public void calculateOffsetAndSave() {
        SaveHandler handler = new SaveHandler();
        handler.saveOffset(new OffsetCalculator().calculatorOffset(new Image()));
    }
}
