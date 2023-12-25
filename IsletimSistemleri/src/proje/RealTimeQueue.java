package proje;

import java.util.ArrayList;
import java.util.List;

public class RealTimeQueue {
	private List<Process> realtime_queue;
	
	//Kurucu
	public RealTimeQueue()
	{
		realtime_queue = new ArrayList<>();
	}
	
	//Kuyruğa Ekleme İşlemi
	public void Enqueue(Process process)
	{
		realtime_queue.add(process);
	}
	
	//Kuyruktan Çıkarma İşlemi
	public void Dequeue()
	{
		if (!realtime_queue.isEmpty())
			realtime_queue.remove(0);
	}
	
	//Diğer sınıflarda kullanılabilmesi için kuyruk boş mu işlemi
	public boolean isEmpty()
	{
		return realtime_queue.isEmpty();
	}
}