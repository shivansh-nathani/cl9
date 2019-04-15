package mpifresh;

import mpi.MPI;

public class mpi {
	public static void main(String[] args) {
		MPI.Init(args);
		int rank = MPI.COMM_WORLD.Rank();
		System.out.println(rank);
		if(rank == 1) {
			int[] data = new int[1];
			data[0]= 100;
			MPI.COMM_WORLD.Send(data, 0, 1, MPI.INT, 0, MPI.ANY_SOURCE);
			MPI.COMM_WORLD.Recv(data, 0, 1, MPI.INT, 0, MPI.ANY_SOURCE);
			System.out.println(data[0]);
		}
		else {
			int[] data=new int[1];
			MPI.COMM_WORLD.Recv(data, 0, 1, MPI.INT,1, MPI.ANY_SOURCE);
			data[0] = data[0]*2;
			MPI.COMM_WORLD.Send(data, 0, 1, MPI.INT,1,MPI.ANY_SOURCE);
		}
	}
}
