package com.cg.javaeightfeature;
// Program to demonstrate java 8 feature: Default method
public class DefaultMethodDemo {
private static Government gov;
	public static void main(String[] args) {
		// This is the basic instantiation of methods present in each classes.
		System.out.println("Democracy");
		Democracy democrats=new Democracy();
		democrats.forThePeople();
		democrats.forSecurity();
		democrats.haveAuthority();
		democrats.election();
		democrats.fundamentalLaws();
System.out.println("------------------------------------------------------------------");

		System.out.println("Communism");
		Communism commrads=new Communism();
		commrads.forThePeople();
		commrads.forSecurity();
		commrads.haveAuthority();
		commrads.election();
System.out.println("------------------------------------------------------------------");	

		System.out.println("Dictatorship");
		Dictatorship dictator=new Dictatorship();
		dictator.forThePeople();
		dictator.forSecurity();
		dictator.haveAuthority();
System.out.println("==================================================================");	

 		System.out.println("Dictatorship");
		gov= new Dictatorship(); //even though does'nt have implementation, can still use the default methods, but only as it is
		gov.election();
		gov.fundamentalLaws();

System.out.println("------------------------------------------------------------------");

		System.out.println("Communism");
		gov=new Communism();
		gov.election(); // if has implementation, shows the overridden one.
		gov.fundamentalLaws();
	}

}
interface Government{
	// Say, we make a model of what a government is.
			void forThePeople();
			void forSecurity();
			void haveAuthority();
	// Then, we want to update the definition, but not all government share same. to deal with that we update the interface using default methods.
			// so that, we dont risk to get the whole code wrong or so that, rest of the code is still relevant.
			
			// eg. we add election as a trait, but to be safe, we put it as default method.
			default void election() {
				System.out.println("People should be able to choose political authority");
			}
			default void fundamentalLaws() {
				System.out.println("People should have fundamental rights"); 
			}
		}
		class Democracy implements Government{

			@Override
			public void forThePeople() {
				System.out.println("Government is made for the people");	
			}

			@Override
			public void forSecurity() {
				System.out.println("Government is made for the security people");
			}

			@Override
			public void haveAuthority() {
				System.out.println("Govenment has is given some authority");
			}
			
			@Override
			public void election() {
				System.out.println("People can choose political authority");
			} 
			
			@Override
			public void fundamentalLaws() {
				
				System.out.println("People have fundamental rights"); 
			}
			
		}
		class Communism implements Government{

			@Override
			public void forThePeople() {
				System.out.println("Government is made for the people");	
			}

			@Override
			public void forSecurity() {
				System.out.println("Government is made for the security people");
			}

			@Override
			public void haveAuthority() {
				System.out.println("Govenment has is given some authority");
			}
			
			@Override
			public void election() {
				System.out.println("People can choose political authority");
			}
			
		}
		class Dictatorship implements Government{

			@Override
			public void forThePeople() {
				System.out.println("Government is made for the people");	
			}

			@Override
			public void forSecurity() {
				System.out.println("Government is made for the security people");
			}

			@Override
			public void haveAuthority() {
				System.out.println("Govenment has is given some authority");
			}
			
		}
