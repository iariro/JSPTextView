package kumagai.textview.struts2;

import java.io.*;
import org.apache.struts2.convention.annotation.*;

/**
 * ファイル表示アクション。
 * @author kumagai
 */
@Namespace("/textview")
@Results
({
	@Result(name="success", location="/textview/textview.jsp"),
	@Result(name="error", location="/textview/error.jsp")
})
public class TextViewAction
{
	public String folder;
	public String filename;
	public String text;

	/**
	 * ファイルリスト表示アクション。
	 * @return 処理結果
	 */
	@Action("textview")
    public String execute()
    	throws Exception
	{
		try
		{
			File file = new File(folder, filename);
			byte [] buffer = new byte [(int)file.length()];
			FileInputStream stream = new FileInputStream(file.getPath());
			stream.read(buffer);
			stream.close();

			text = new String(buffer);

			return "success";
		}
		catch (Exception exception)
		{
			return "error";
		}
	}
}
