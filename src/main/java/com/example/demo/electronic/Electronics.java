
package com.example.demo.electronic;
    import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="electronics_device")
	public class Electronics {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		private String name;
		private String category;
		private Integer price;
		
		public Electronics() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Electronics(int id, String name, String category,int price) {
			super();
			this.id = id;
			this.name = name;
			this.category = category;
			this.price=price;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getcategory() {
			return category;
		}
		public void setcategory(String category) {
			this.category = category;
		}
		public Integer getprice() {
			return price;
		}
		public void setprice(int price) {
			this.price= price;
		}
		@Override
		public String toString() {
			return "Electronics [id=" + id + ", name=" + name + ", category=" + category + " , price="+ price +"]";
		}
		

	}






