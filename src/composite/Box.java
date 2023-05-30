/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Box implements SuperBox{
    private List<SuperBox> insideTheBox = new ArrayList<>();
    
    @Override
    public String getName() {
        String ret = "";
        for (SuperBox superBox : insideTheBox) {
            ret += superBox.getName() + " ";
        }
        return ret;
    }
    
    public void addChildren(SuperBox superBox){
        insideTheBox.add(superBox);
    }
    
}
