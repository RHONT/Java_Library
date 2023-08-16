package Other_Java_Core.Generalization.NewGeneration;


import Other_Java_Core.Generalization.Base.HeadWork;
import Other_Java_Core.Generalization.Enum.NameForRobotsParts;
import Other_Java_Core.Generalization.Intarfase.HeadActions;

public class HeadChild extends HeadWork<HeadWork> {

    public HeadChild(NameForRobotsParts nameForRobotsParts, int armor, HeadActions headActions) {
        super(nameForRobotsParts, armor, headActions);
    }
    public void newFunc(){
        System.out.println("Рожденный в СССР");
    }
}
