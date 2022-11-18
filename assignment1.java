Scanner inputData = new Scanner(System.in);
Scanner.out.println("enter a sentence(any english sentnce)");
String sentence = inputData.nextLine();
System.out.println("enter a letter(any letter from A to Z)");
String letter = inputData.nextLine();

int index = sentence.indexOf(letter);

if(index == -1)
{
	System.out.println("the letter does not exist in sentence");

}
else
{
	System.out.println(sentence.substring(index+1));
}