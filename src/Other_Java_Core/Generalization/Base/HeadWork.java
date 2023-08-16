package Other_Java_Core.Generalization.Base;


import Other_Java_Core.Generalization.Enum.NameForRobotsParts;
import Other_Java_Core.Generalization.Intarfase.HeadActions;

public class HeadWork<T extends HeadWork> {
    private HeadActions headActions;
    final String name;
    int armor;

    public HeadWork(NameForRobotsParts nameForRobotsParts, int armor, HeadActions headActions) {
        this.name = nameForRobotsParts.getName();
        this.armor = armor;
        this.headActions = headActions;
    }

    public HeadActions getHeadActions() {
        return headActions;
    }

    public String getName() {
        return name;
    }

}
