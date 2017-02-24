package com.cdc.algorithm_problem;
/**
 * 统计字符个数
 * 字母个数,汉字个数,数字字数,空格个数,其它字符个数。
 * @author cdc
 *
 */
public class StatisticalCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getCharsNums1("jkluyo 9876543 !* 中国"));
		
	}
	
	public static String getCharsNums1(String str){
		//数字个数
		int digital=0;
		//字母个数
		int character=0;
		//非数字,字母,空格的个数
		int other=0;
		//空格个数
		int blank=0;
		int chineseCharacters=0;
		char[] ch=str.toCharArray();
		int i=0;
		String[] arrStr=new String[ch.length];
		for(i=0;i<ch.length;i++){
			arrStr[i]=String.valueOf(ch[i]);
			if(ch[i]>='0' && ch[i]<='9'){
				digital++;
			}else if(ch[i]>='a'&& ch[i]<='z'||ch[i]>='A'&& ch[i]<='Z'){
				character++;
			}else if(ch[i]==' '){
				blank++;
			}else{
				other++;
			}
		}
		String ee1="[\u4e00-\u9fa5]";
		for (String sr:arrStr) {
			if(sr.matches(ee1)){
				chineseCharacters++;
			}
		}
		
		StringBuilder  stringBuilder=new StringBuilder();
		stringBuilder.append("数字个数:");
		stringBuilder.append(digital);
		stringBuilder.append("\n");
		stringBuilder.append("字母个数:");
		stringBuilder.append(character);
		stringBuilder.append("\n");
		stringBuilder.append("空格个数:");
		stringBuilder.append(blank);
		stringBuilder.append("\n");
		stringBuilder.append("汉字个数:");
		stringBuilder.append(chineseCharacters);
		stringBuilder.append("\n");
		stringBuilder.append("非汉字,数字,字母,空格的个数:");
		stringBuilder.append(other-chineseCharacters);
		return stringBuilder.toString();
	}

}
