package interfaces;

import java.util.List;
import javax.ejb.Local;
import tp_aa.SubTask;

@Local
public interface ManageSubTaskLocal {
    public SubTask getSubTask(int idSubTask);
    public List<SubTask> getSubTasks(int idTask);
}
