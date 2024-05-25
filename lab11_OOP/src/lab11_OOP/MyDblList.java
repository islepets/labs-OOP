package lab11_OOP;

public class MyDblList {
	private DblListElem head = null;
	private DblListElem tail = null;
	
	public void addToHead(String value) {
		DblListElem e = new DblListElem();
		e.value = value;
		e.next = head;
		e.prev = null;
		if(tail == null) {
			tail = e;
		}
		else {
			head.prev = e;
		}
		head = e;
	}
	
	public void addToTail(String value) {
		DblListElem e = new DblListElem();
		e.value = value;
		e.prev = tail;
		e.next = null;
		if(head == null) {
			head = e;
		}
		else {
			tail.next = e;
		}
		tail = e;
	}
	
	public String toString() {
		String res ="";
		DblListElem pos = head;
		while(pos != null) {
			res += "[" + pos.value + "] --->";
			pos = pos.next;
		}
		return res;
	}
	
	public String toStringBack() {
		String res ="";
		DblListElem pos = tail;
		while(pos != null) {
			res += "[" + pos.value + "] --->";
			pos = pos.prev;
		}
		return res;
	}
	
	public String getHeader() {
		if(head == null)
			return "";
		String res = head.value;
		head = head.next;
		if(head == null) {
			tail = null;
			return res;
		}
		head.prev = null;
		return res;
	}
	
	public String getTail() {
		if(tail == null)
			return "";
		String res = tail.value;
		tail = tail.prev;
		if(tail == null) {
			head = null;
			return res;
		}
		tail.next = null;
		return res;
	}
	
	public boolean search(String val) {
		DblListElem pos = head;
		while(pos != null) {
			if(pos.value.compareTo(val) == 0)
				return true;
			pos = pos.next;
				
		}
		return false;
	}
	
	public boolean deleteElem(String val) {
		if(head == null)
			return false;
		if(head.value.compareTo(val) == 0) {
			getHeader();
			return true;
		}
		if(tail.value.compareTo(val) == 0) {
			getTail();
			return true;
		}
		
		DblListElem pos = head;	
		while(pos.next != null) {
			if(pos.next.value.compareTo(val) == 0) {
				pos.next = pos.next.next;
				pos.next.prev = pos;
				return true;
			}
			pos = pos.next;
		}
		return false;
	}
	
	public void clear() {
		head = null;
		tail = null;
	}
	
}
