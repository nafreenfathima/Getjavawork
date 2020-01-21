public class Product {
        private long pid;
		private String pname;
		private String sname;
		
		public Product() {
			super();
		}

		public Product(long pid, String pname, String sname) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.sname = sname;
		}

		public long getPid() {
			return this.pid;
		}

		public void setPid(long pid) {
			this.pid = pid;
		}

		public String getPname() {
			return this.pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public String getSname() {
			return this.sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			if (pid != other.pid)
				return false;
			if (pname == null) {
				if (other.pname != null)
					return false;
			} else if (!pname.equals(other.pname))
				return false;
			if (sname == null) {
				if (other.sname != null)
					return false;
			} else if (!sname.equals(other.sname))
				return false;
			return true;
		}

		void display()
		{
			System.out.println("Product Id is "+this.pid);
			System.out.println("Product Name is "+this.pname);
			System.out.println("Supplier Name is "+this.sname);
			
		}

	}
	