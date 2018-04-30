package service;

public class ClientWS {
public static void main(String[] args) {
	
	BanqueWS stub = new BanqueServiceService().getBanqueWSPort();
	double res = stub.convertionEuroToDh(800);
	System.out.println(res);
}
}
