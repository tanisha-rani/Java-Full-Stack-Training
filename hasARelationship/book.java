package hasARelationship;

public class book {
	private pages []pg= {new pages("ruled"),
			new pages("lined"),
			new pages("drawing"),
			new pages("coloured")};

	public pages[] getPg() {
		return pg;
	}

	public void setPg(pages[] pg) {
		this.pg = pg;
	}
	
}
