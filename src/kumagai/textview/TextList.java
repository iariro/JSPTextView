package kumagai.textview;

import java.io.*;
import java.util.*;

/**
 * テキストファイルのリスト。
 */
public class TextList
	extends ArrayList<String>
{
	/**
	 * テストコード。
	 * @param args 未使用
	 */
	public static void main(String[] args)
	{
		for (String file : new TextList("C:\\Users\\kumagai\\Documents\\Nefertiti の文書\\Private\\tvradio\\"))
		{
			System.out.println(file);
		}
	}

	/**
	 * テキストファイルのリスト。
	 * @param path 対象のパス
	 */
	public TextList(String path)
	{
		if (path != null)
		{
			// 指定あり
			
			String [] files =
				new File(path).list(
					new FilenameFilter()
					{
						@Override
						public boolean accept(File dir, String name)
						{
							return name.toLowerCase().endsWith(".txt");
						}
					});

			if (files != null)
			{
				for (String file : files)
				{
					add(file);
				}
			}
		}
	}
}
