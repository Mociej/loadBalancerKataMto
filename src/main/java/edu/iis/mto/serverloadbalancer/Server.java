package edu.iis.mto.serverloadbalancer;

import java.util.ArrayList;
import java.util.List;

public class Server {

	public double currentLoadPecentage;
	private int capacity;
	private List<Vm> vms=new ArrayList<Vm>();

	public Server(int capacity) {
		this.capacity=capacity;
	}

	public boolean contains(Vm vm){
		return true;
	}

	public void addVm(Vm vm){
		this.vms.add(vm);
		this.currentLoadPecentage=(double) vm.size/(double)this.capacity*100.0d;
	}

	public int vmsCount(){
		return vms.size();
	}
}
