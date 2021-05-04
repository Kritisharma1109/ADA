import java.util.*;
public class ques8 {
	
	public void word(String str,String search) {
		int j=0;
		String mismatch="";
		int count=0;
		for(int i=0;i<str.length();i++) {                                          //traversing the whole sentence
			int flag=0;
			j=0;
			String mis="";
			while(str.charAt(i)!=' ') {                                            //checking spaces
				if(j==search.length()) {                                           //when search word fully traversed
					while(str.charAt(i)!=' ') {
						i++;
						flag=2;
						if(i==str.length()) {                                      //for last word
							break;
						}
					}
					break;
				}
				if(str.charAt(i)==search.charAt(j)) {                             //comparing characters
					mis=mis.concat(Character.toString(str.charAt(i)));            //concatenating characters if matched
					j++;
					i++;
				}
				else {                                     
					flag++;
					if(flag==2) {                                                //if more than one mismatched character
						while(str.charAt(i)!=' ') {                              //traversing till space found to skip unwanted word
							i++;
							if(i==str.length()) {                                //for last word
								break;
							}
						}
					}
					else {                                                       //if only one mismatched
						mis=mis.concat(Character.toString(str.charAt(i)));       //concatenating that mismatched character
						i++;
						j++;
					}
				}
				if(i==str.length()) {
					break;
				}
			}
			if (flag==0) {                                                       //if fully matched
				count++;
			}
			else if(flag==1) {                                                   //if one mismatched
				mismatch=mismatch.concat(mis);                                   //appending one mismatch words
				mismatch=mismatch.concat(" ");
			}
		}
		System.out.println("Number of same words as "+search+": "+count);
		if(mismatch.equals("")) {                                                //mismatch string empty i.e. no mismatch words
			System.out.println("No mismatch words");
		}
		else {
			String[] mismatched=mismatch.split(" ");
			System.out.println("Words having one mismatch:");
			for(int k=0;k<mismatched.length;k++) {
				System.out.println(mismatched[k]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		ques8 obj= new ques8();
		System.out.println("Enter the sentence");
		String sentence= sc.nextLine();
		System.out.println("Enter the word to be searched");
		String find= sc.next();
		obj.word(sentence, find);
	}

}
