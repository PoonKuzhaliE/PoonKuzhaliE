import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MyProgram2 {
static Stack<ArrayList<ArrayList<String>>> jio = new Stack<ArrayList<ArrayList<String>>>();
public static void jioStack() {

ArrayList<ArrayList<String>> reChargeOffers = new ArrayList<>();

ArrayList<String> talkTime = new ArrayList<>();
talkTime.add("Recharge Rs.150 and Get TalkTime of Rs.150   Validity: 90 Days");
talkTime.add("Recharge Rs.220 and Get TalkTime of Rs.220   Validity: 120 Days");
talkTime.add("Recharge Rs.500 and Get TalkTime of Rs.500   Validity: 200 Days");
talkTime.add("Recharge Rs.750 and Get TalkTime of Rs.750   Validity: 365 Days");
reChargeOffers.add(talkTime);

ArrayList<String> dataPacks = new ArrayList<>();
dataPacks.add("Recharge Rs.11 and Get 1GB Data   Validity: Existing Plan");
dataPacks.add("Recharge Rs.21 and Get 2GB Data   Validity: Existing Plan");
dataPacks.add("Recharge Rs.51 and Get 6GB Data   Validity: Existing Plan");
dataPacks.add("Recharge Rs.101 and Get 12GB Data   Validity: Existing Plan");
reChargeOffers.add(dataPacks);

ArrayList<String> unlimitedPacks = new ArrayList<>();
unlimitedPacks.add("Recharge Rs.149 and Get Data 1GB/Day, 100 SMS/Day, Talktime:Unlimited, Validity: 20 Days");
unlimitedPacks.add("Recharge Rs.299 and Get Data 2GB/Day, 100 SMS/Day, Talktime:Unlimited, Validity: 28 Days");
unlimitedPacks.add("Recharge Rs.666 and Get Data 1.5GB/Day, 100 SMS/Day, Talktime:Unlimited, Validity: 84 Days");
unlimitedPacks.add("Recharge Rs.719 and Get Data 2GB/Day, 100 SMS/Day, Talktime:Unlimited, Validity: 84 Days");
reChargeOffers.add(unlimitedPacks);

ArrayList<String> isdPacks = new ArrayList<>();
isdPacks.add("Recharge Rs.501 and Get TalkTime of Rs.424.58, ISD SMS:5   Validity:28 Days");
reChargeOffers.add(isdPacks);

ArrayList<String> roamingPacks = new ArrayList<>();
roamingPacks.add("Recharge Rs.1101 and Get Roaming Usage of Rs.933.05, ISD SMS:5   Validity:28 Days");
reChargeOffers.add(roamingPacks);

ArrayList<ArrayList<String>> callerTuneLanguage = new ArrayList<>();

ArrayList<String> tamil = new ArrayList<>();
tamil.add("Arabic Kuthu from Beast");
tamil.add("Mother Song from Valimai");
tamil.add("Mudhal Nee Mudivum Nee from Mudhal Nee Mudivum Nee");
tamil.add("Yaar Alaippadhu from Maara");
tamil.add("Tum Tum from Enemy");
callerTuneLanguage.add(tamil);


ArrayList<String> telugu = new ArrayList<>();
telugu.add("Sree Valli from Pushpa");
telugu.add("Nattu Nattu from RRR");
telugu.add("Inkem Inkem from Geetha Govindham");
telugu.add("Maate Vinathuga from Taxiwala");
callerTuneLanguage.add(telugu);

ArrayList<String> hindi = new ArrayList<>();
hindi.add("Jai Jai ShivShankar from War");
hindi.add("Sultan Title Song from Sultan");
hindi.add("Jab Tak from M S Dhoni The Untold Story");
hindi.add("Tum Hi Ho from Aashiqui 2");
callerTuneLanguage.add(hindi);

ArrayList<String> malayalam = new ArrayList<>();
malayalam.add("Kalakkatha from Ayyappanum Koshiyum");
malayalam.add("Podipparana from Queen");
malayalam.add("Kudukku song from Love Action Drama");
malayalam.add("Malarae from Premam");
callerTuneLanguage.add(malayalam);

ArrayList<ArrayList<String>> complaints = new ArrayList<>();

ArrayList<String> com =new ArrayList<>();
com.add("Plese Contact 198 for Network and Services Complaints");
com.add("Please Contact 199 for Plans related queries");
com.add("Please Contact 1860-893-3333 for Customer Care");
com.add("Please Contact 1800-889-9999 if Calling from Non-Jio Number");
complaints.add(com);

jio.push(reChargeOffers);
jio.push(callerTuneLanguage);
jio.push(complaints);
		
}

public static void main(String[] args) {
	
	jioStack();

	System.out.println("Welcome to Jio Customer Jio Services ");
	System.out.println("=====================================");
	System.out.println();
	System.out.println("Please Enter '1' to know RechargeOffers");
	System.out.println("Please Enter '2' to set Caller Tune");
	System.out.println("Please Enter '3' to know about Complaint Services");
	System.out.println();
	System.out.println("******************");

	Scanner s = new Scanner(System.in);
	System.out.print("Enter Option : ");
	int input = s.nextInt();
	System.out.println();

	switch (input) {
	case 1: {
		jio.pop();
		jio.pop();
		System.out.println("Please Enter '1' to know TalkTime Offers");
		System.out.println("Please Enter '2' to know Data Pack Offers");
		System.out.println("Please Enter '3' to know Unlimited Pack Offers");
		System.out.println("Please Enter '4' to know ISD Offers");
		System.out.println("Please Enter '5' to know Roaming Pack Offers");
		System.out.println();
		System.out.println("******************");
		System.out.print("Enter Option : ");
		int option = s.nextInt();
		int i = option-1;
		System.out.println();
		ArrayList<ArrayList<String>> peek = jio.peek();
		for (int j = 0; j < peek.get(i).size(); j++) {
			System.out.println(peek.get(i).get(j));
		}

		break;
	}
	case 2: {
		jio.pop();
		System.out.println("Please Enter '1' for Tamil Songs");
		System.out.println("Please Enter '2' for English Songs");
		System.out.println("Please Enter '3' for Telugu Songs");
		System.out.println("Please Enter '4' for Hindi Songs");
		System.out.println("Please Enter '5' for Malayalam Songs");
		System.out.println();
		System.out.println("******************");
		System.out.print("Enter Option : ");
		int option = s.nextInt();
		int i = option-1;
		System.out.println();
		ArrayList<ArrayList<String>> peek = jio.peek();
		for (int j = 0; j < peek.get(i).size(); j++) {
			System.out.println(peek.get(i).get(j));
		}

		break;
	}
	case 3: {
		jioStack();
		jio.peek();
		for (int i = 0; i < jio.peek().size(); i++) {
			for (int j = 0; j < jio.peek().get(i).size(); j++) {
			System.out.println(jio.peek().get(i).get(j));
			}
		}
		break;
	}
	default:
		System.out.println("Entered Option is Not Available in the List");
		break;
	}
}
}