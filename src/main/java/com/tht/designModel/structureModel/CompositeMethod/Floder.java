package com.tht.designModel.structureModel.CompositeMethod;

/**
 * Created by thrall on 2018/11/27.
 */
public class Floder extends Component {
    Component[] files;
    String folderName;

    public Floder(Component[] sources){
        files=sources;
    }

    public void scan(){
        for (Component f:files){
            if (f instanceof File){
                System.out.println("File "+((File) f).fileName);
            }else if(f instanceof Floder){
                Floder e = (Floder)f;
                System.out.println("Folder "+e.folderName);
                e.scan();
            }
        }
    }



}
