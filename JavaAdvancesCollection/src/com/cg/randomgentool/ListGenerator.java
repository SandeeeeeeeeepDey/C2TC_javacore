package com.cg.randomgentool;

// Program to make no brainer list.
import java.util.ArrayList;
public class ListGenerator {
	public static void main(String[] s) {
		ListGen l=new ListGen();
		
		 // print copy paste material.
		for(int i=0;i<l.list.size(); i++) {
			System.out.println("LHashSet.add("+((l.list.get(i)).toString())+");");
		}
		
		StringGen str=new StringGen();
		for(int i=0;i<l.list.size(); i++) {
			System.out.println("treeSet.add(\""+((str.list.get(i)).toString())+"\");");
		}

		
	}
}
//random number generator
class ListGen{
	ArrayList<Integer> list=new ArrayList<>();
	ListGen(){
		for(int i=0;i<10;i++)
			list.add((int)(Math.random()*100));	
	}
}

// random String generator
class StringGen{
	ArrayList<String> list=new ArrayList<>();
	StringGen(){
		for(int i=0;i<10;i++)
			list.add(positiveWords[(int)(Math.random()*100)]);	
	}
	String[] positiveWords = {
		    "Barrel",
		    "Cat",
		    "Pudding Stone Protector",
		    "Lunchroom",
		    "Cars",
		    "Metal",
		    "Frogs",
		    "Tail",
		    "Cake",
		    "Letter",
		    "Bells",
		    "Presbyterian Church",
		    "Level",
		    "Stream",
		    "Wood",
		    "Scarecrow",
		    "Discussion",
		    "Egg",
		    "Investment Advisor",
		    "Time and a Half",
		    "Gentlefolk",
		    "Feast",
		    "Spiral Cake",
		    "Adult",
		    "Reward",
		    "Pelican",
		    "Oranges",
		    "Brothers",
		    "Porter",
		    "Man",
		    "Property",
		    "Lead",
		    "Fairies",
		    "Stockings",
		    "Branch",
		    "Cup",
		    "Rabbits",
		    "Note",
		    "Platinum Blonde",
		    "Nerve",
		    "Legal Document",
		    "Summer",
		    "Minute",
		    "Train",
		    "Bomb",
		    "Oven",
		    "Division",
		    "Relation",
		    "Sky",
		    "Lettuce",
		    "Railway",
		    "Experience",
		    "Drain",
		    "Print",
		    "Greater Green Mamba",
		    "Field",
		    "Trains",
		    "Aunt",
		    "Discovery",
		    "Internal Respiration",
		    "Downtown",
		    "Face Card",
		    "Overlord",
		    "Circus",
		    "Vegetable",
		    "Pail",
		    "Internal Control",
		    "Loaf",
		    "Cause",
		    "Speaker",
		    "Unearned Increment",
		    "Farmer",
		    "Tiger",
		    "Comptroller General",
		    "Comparison",
		    "Cart",
		    "Edge",
		    "Hood",
		    "Attraction",
		    "Touch",
		    "Carrot",
		    "Computer File Name",
		    "Movie Star",
		    "Scallop",
		    "Love",
		    "Tub",
		    "National Security Agency",
		    "Silver",
		    "Name",
		    "Fear",
		    "Front",
		    "Hovercraft",
		    "Depersonalization Disorder",
		    "Pillow",
		    "Dirt",
		    "Sheep",
		    "Condition",
		    "Shivering Pink Toenails",
		    "Toad",
		    "Female Monarch",
		    "Giraffe",
		    "Sleep",
		    "Aggressive Criminal",
		    "Knight’s Service",
		    "Ship’s Company",
		    "Hub",
		    "Sun",
		    "Detail",
		    "Foodstuff",
		    "Hoe",
		    "Crayon",
		    "Insect",
		    "Religion",
		    "List",
		    "Parent",
		    "Bracelet",
		    "Volcanic Crater",
		    "Destruction",
		    "Cracker",
		    "Vest",
		    "Whistle",
		    "Horses",
		    "Solar Furnace",
		    "Yak",
		    "Twisting Parsnip",
		    "Ground",
		    "Haircut",
		    "Father",
		    "Bathrobe",
		    "Potato",
		    "Suit",
		    "Sidewalk",
		    "Bread",
		    "Coffee Pot",
		    "Clocks",
		    "Pie",
		    "Truck",
		    "Gold",
		    "Land",
		    "Toilet",
		    "Believer",
		    "Stomach",
		    "Ferret",
		    "Baby",
		    "Visitor",
		    "Olfactory Bulb"};
}

