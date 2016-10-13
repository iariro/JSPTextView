package kumagai.textview.struts2;

import java.util.*;

/**
 * フォルダと配下のファイル情報。
 */
class FolderAndFiles
{
	public final String folder;
	public final ArrayList<String> files;

	/**
	 * 指定の値をメンバーに割り当て
	 * @param folder フォルダ
	 * @param files ファイル名
	 */
	public FolderAndFiles(String folder, ArrayList<String> files)
	{
		this.folder = folder;
		this.files = files;
	}
}