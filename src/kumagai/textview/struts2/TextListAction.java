package kumagai.textview.struts2;

import java.util.*;

import javax.servlet.*;
import org.apache.struts2.*;
import org.apache.struts2.convention.annotation.*;
import kumagai.textview.*;

/**
 * ファイルリスト表示アクション。
 * @author kumagai
 */
@Namespace("/textview")
@Results
({
	@Result(name="success", location="/textview/textlist.jsp"),
	@Result(name="error", location="/textview/error.jsp")
})
public class TextListAction
{
	public ArrayList<FolderAndFiles> folderAndFilesCollection;

	/**
	 * ファイルリスト表示アクション。
	 * @return 処理結果
	 */
	@Action("textlist")
    public String execute()
    	throws Exception
	{
		ServletContext context = ServletActionContext.getServletContext();

		folderAndFilesCollection = new ArrayList<FolderAndFiles>();

		String folder;

		for (int i=1 ;
			(folder = context.getInitParameter("TextViewFilePath" + i)) != null ;
			i++)
		{
			folderAndFilesCollection.add(
				new FolderAndFiles(folder, new TextList(folder)));
		}

		return "success";
	}
}
