package tp4.DIP;

import tp4.DIP.modele.BackEndDeveloper;
import tp4.DIP.modele.Developer;
import tp4.DIP.modele.FrontEndDeveloper;
import tp4.DIP.modele.Project;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Developer> developers = new ArrayList<>();
        developers.add(new BackEndDeveloper());
        developers.add(new FrontEndDeveloper());
        Project p = new Project(developers);
        p.implement();
    }
}
