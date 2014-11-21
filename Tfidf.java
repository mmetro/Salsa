import java.lang.*;
import java.io.*;
import java.lang.String;
import java.util.HashMap;



class Tfidf {
	
	public static int findTerm(HashMap<String ,Integer> mp, String term){
		int val =mp.get(term);
		System.out.println(val);
		return val;
	}
	
	

	public static double tfidf(double tf, double idf){
		return tf*idf;
	}
	public static double tf(int termFreq){
		if(termFreq >0)
			return 1+(Math.log10(termFreq));
		else{
			return 0;
		}
	}
	public static double idf(int noDocs, int termInDoc){
		noDocs+=2;
		return Math.log10((noDocs)/(1+termInDoc));
	}
    public static void main(String[] args) {
        HashMap<String, Integer> newMap = new HashMap<String,Integer>();
        newMap.put("nigger", 1);
        newMap.put("justMike", 2);
        newMap.put("simplyTorch", 3);
        int findt = findTerm(newMap, "simplyTorch");
    }
}