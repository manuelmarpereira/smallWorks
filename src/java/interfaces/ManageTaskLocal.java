package interfaces;

import javax.ejb.Local;
import tp_aa.Task;

@Local
public interface ManageTaskLocal {
    public Task getTask(int id);
}
