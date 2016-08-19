public class TVActorDriver{
	public static void main(String[] args){
		TVActor a = new TVActor();
		a.name = "Thomas Middleditch";
		a.role = "Richard Hendricks";
		a.age = 24;
		
		TVActor b = new TVActor();
		b.name = "Martin Starr";
		b.role = "Bertram Gilfoyle";
		b.age = 25;
		
		TVActor c = new TVActor();
		c.name = "Kumail Nanjiani";
		c.role = "Dinesh Chugtai";
		c.age = 26;
		
		System.out.println(a.name + " played " + a.role + " age " + a.age);
		System.out.println(b.name + " played " + b.role + " age " + b.age);
		System.out.println(c.name + " played " + c.role + " age " + c.age);
	}
}

//by line 14, there are at least nine objects floating around in memory: three TVActor objects and six String objects (two per TVActor).
