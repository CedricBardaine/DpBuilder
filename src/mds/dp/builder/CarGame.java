package mds.dp.builder;

public class CarGame extends Game {
	public CarGame() {
		this.name = "The incredibly common car";
		this.price = (float) 0;
		this.theBag = new Bag();
	}

	public CarGame(int model) {
		switch (model) {
		case 0:
			this.name = "The incredibly common car";
			this.price = (float) 0;
			this.theBag = new Bag();
			break;
			
		case 1:
			this.name = "The green car";
			this.price = (float) 0;
			this.theBag = new Bag();
			break;
			
		case 2:
			this.name = "The yellow car";
			this.price = (float) 0;
			this.theBag = new Bag();
			break;
			
		case 3:
			this.name = "The rarest car";
			this.price = (float) 0;
			this.theBag = new Bag();
			break;

		default:
			this.name = "The incredibly common car";
			this.price = (float) 0;
			this.theBag = new Bag();
			break;
		}
	}
}
