package com.cdc.algorithm_problem;
/**
 * ͳ���ַ�����
 * ��ĸ����,���ָ���,��������,�ո����,�����ַ�������
 * @author cdc
 *
 */
public class StatisticalCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getCharsNums1("jkluyo 9876543 !* �й�"));
		
	}
	
	public static String getCharsNums1(String str){
		//���ָ���
		int digital=0;
		//��ĸ����
		int character=0;
		//������,��ĸ,�ո�ĸ���
		int other=0;
		//�ո����
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
		stringBuilder.append("���ָ���:");
		stringBuilder.append(digital);
		stringBuilder.append("\n");
		stringBuilder.append("��ĸ����:");
		stringBuilder.append(character);
		stringBuilder.append("\n");
		stringBuilder.append("�ո����:");
		stringBuilder.append(blank);
		stringBuilder.append("\n");
		stringBuilder.append("���ָ���:");
		stringBuilder.append(chineseCharacters);
		stringBuilder.append("\n");
		stringBuilder.append("�Ǻ���,����,��ĸ,�ո�ĸ���:");
		stringBuilder.append(other-chineseCharacters);
		return stringBuilder.toString();
	}

}
