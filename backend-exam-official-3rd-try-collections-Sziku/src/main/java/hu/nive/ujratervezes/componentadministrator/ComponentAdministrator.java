package hu.nive.ujratervezes.componentadministrator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComponentAdministrator {
    public List<String> collectCommonComponents(List<String> firstCircuitComponents, List<String> secondCircuitComponents){
        Set<String> newComponentSet = new HashSet<>();

        if(firstCircuitComponents == null || secondCircuitComponents == null) {
            return newComponentSet.stream().toList();
        }
        for(String component1 : firstCircuitComponents){
            for (String component2 : secondCircuitComponents){
                if (component1.equals(component2)){
                    newComponentSet.add(component1);
                }
            }
        }
        return newComponentSet.stream().toList();
    }
}
