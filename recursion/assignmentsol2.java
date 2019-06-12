package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class assignmentsol2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
		String str = scn.nextLine();
//		String str="hihihihi";
		StringBuilder sb = new StringBuilder(str);
		StringBuilder sb1 = new StringBuilder(str);
		StringBuilder sb2 = new StringBuilder(str);
//		movex(sb,0,0);
//		remdup(sb,0,0);
//		dupform(sb,0);
		hibyec(sb);
		hibye(sb1);
		hibyer(sb2);
//		aaa(str,0,0);
//		aaac(sb,0);
//		balanced(str,0);
	}

	
	public static void movex(StringBuilder sb,int strt,int count){
		if(strt>=sb.length() || count>sb.length()){
			System.out.println(sb);
			return;
		}
		char ch=sb.charAt(strt);
		if(ch=='x'){
			sb.append(ch);
			sb.deleteCharAt(strt);
			count++;
			movex(sb,strt,count);
		}
		else{
		movex(sb,strt+1,count);
		}
	}
	public static void remdup(StringBuilder sb,int strt,int count){
		if(strt==sb.length()-1 || count>sb.length())
		{
			System.out.println(sb);
			return;
		}
		char ch=sb.charAt(strt);
		char ch1=sb.charAt(strt+1);
		if(ch==ch1)
		{
			sb.deleteCharAt(strt+1);
			count++;
			remdup(sb,strt,count);
		}
		else{
			count++;
		remdup(sb,strt+1,count);
		}
	}
	public static void dupform(StringBuilder sb,int strt){
		if(strt==sb.length()-1)
		{
			System.out.println(sb);
			return;
		}
		char ch=sb.charAt(strt);
		char ch1=sb.charAt(strt+1);
		if(ch==ch1)
		{
			sb.insert(strt+1, '*');
			dupform(sb,strt);
		}
		else{
			
		dupform(sb,strt+1);
		}
	}
	public static void hibyec(StringBuilder sb){
		int count=0;
		for(int i=0;i<sb.length();i++)
		{
		int a=sb.indexOf("hit");
		if(a!=-1){
			sb.delete(a, a+3);
//			count++;
		}
		}
		for(int i=0;i<sb.length();i++)
		{
		int a=sb.indexOf("hi");
		if(a!=-1){
			sb.delete(a, a+2);
			count++;
		}
		}
		System.out.println(count);
	}
	public static void hibye(StringBuilder sb){
		for(int i=0;i<sb.length();i++)
		{
		int a=sb.indexOf("hi");
		if(a!=-1  && a!=sb.length()-2 ){
			if( sb.charAt(a+2)!='t')
			sb.delete(a, a+2);
		}
		}
		
		if(sb.charAt(sb.length()-1) =='i' &&  sb.charAt(sb.length()-2) =='h'){
			sb.delete(sb.length()-2,sb.length());
		}
		System.out.println(sb);
	}
	public static void hibyer(StringBuilder sb){
		for(int i=0;i<sb.length();i++)
		{
		int a=sb.indexOf("hi");
		if(a!=-1  && a!=sb.length()-2 ){
			if( sb.charAt(a+2)!='t')
				if(a==0){
					sb.delete(a, a+2);
					sb.insert(a, "bye");
				}
				else{
					sb.delete(a, a+2);
					sb.insert(a, "bye");
				}
		}
		}
		
		if(sb.charAt(sb.length()-1) =='i' &&  sb.charAt(sb.length()-2) =='h'){
			sb.delete(sb.length()-2,sb.length());
			sb.insert(sb.length(), "bye");
		}
		System.out.println(sb);
	}
	public static void aaa(String str,int strt,int count)
	{
		if(strt==str.length()-2){
			System.out.println(count);
			return;
		}
		char ch=str.charAt(strt);
		char ch1=str.charAt(strt+1);
		char ch2=str.charAt(strt+2);
		
		if(ch==ch1 && ch1==ch2){
			count++;
			}
		aaa(str,strt+1,count);
		
	}
	public static void aaac(StringBuilder sb,int count)
	{
		if(sb.length()<3){
			System.out.println(count);
			return;
		}
		int a=sb.indexOf("aaa");
		if(a!=-1)
		{
			count++;
			sb.delete(a,a+3);
		}
		aaac(sb,count);
		
		
		
	}
	public static void balanced(String str , int strt){
		if(strt==str.length()){
			System.out.println("false");
			return;
		}
		if(str.charAt(strt)==')'){
			System.out.println("true");
			return;
		}
		
		if(str.charAt(strt)=='('){
			balanced(str,strt+1);
		}
		else{
			balanced(str,strt+1);
		}
		
		
		
		
	}

	
}
