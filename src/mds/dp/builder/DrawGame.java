package mds.dp.builder;

public class DrawGame extends Game {
	public DrawGame() {
		this.name = "The simple draw-game";
		this.price = (float) 0;
		this.theBag = new Bag();
	}

	public DrawGame(int model) {
		switch (model) {
		case 0:
			this.name = "The simple draw-game";
			this.price = (float) 0;
			this.theBag = new Bag();
			break;
		case 1:
			this.name = "The alternate draw-game";
			this.price = (float) 0;
			this.theBag = new Bag();
			break;


		default:
			this.name = "The simple draw-game";
			this.price = (float) 0;
			this.theBag = new Bag();
			break;
		}
	}
}
