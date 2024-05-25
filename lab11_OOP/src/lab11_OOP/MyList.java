package lab11_OOP;

public class MyList {
	private ListElem head = null;
	public void add(String val) {
		ListElem e = new ListElem();
		e.value = val;
		e.next = head;
		head = e;
	}
	
	public String toString() {
		ListElem pos = head;
		String res = "";
		while(pos != null) {
			res += "[" +  pos.value + "] --->"; 
			pos = pos.next;
		}
		return res;
	}
	
	public boolean search(String val) {
		boolean result = false;
		ListElem pos = head;
		while(pos != null) {
			if(pos.value.compareTo(val) == 0) {
				result = true;
				break;
			}
			pos = pos.next;
		}
		return result;
	}
	
	public boolean delete(String val) {
		if(head == null)
			return false;
		if(head.value.compareTo(val) == 0) {
			head = head.next;
			return true;
		}
		ListElem pos = head;
		while(pos.next != null) {
			if(pos.next.value.compareTo(val) == 0) {
				pos.next = pos.next.next;
				return true;
			}
			pos = pos.next;
		}
		return false;
	}
	
	public void clear() {
		head = null;
	}
}
