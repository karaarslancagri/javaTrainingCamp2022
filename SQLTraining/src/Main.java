
public class Main {

	public static void main(String[] args) {
		select * from Product categoryId=1 or categoryId=3

				select * from Product categoryId=1 and Price>10

				select * from Products order by CategoryID=1

				select * from Products where categoryId=1 order by Price desc

				//count kaç sıra oldugunu gösterir

				select count(*) from Products 

				select count(*) from Products where CategoryID=2

				//kategorilerin tekrar edilmicek şekilde listelenilmesi

				select categoryID from products group by CategoryID 

				select categoryID,count(*) from products group by CategoryID

				select categoryID,count(*) from products group by CategoryID having count(*)<10

				select categoryID,count(*) from products where Price>20 group by CategoryID having count(*)<10

				select Products.ProductID, Products.ProductName, Products.Price, Categories.CategoryName from Products inner join Categories on Products.CategoryID = Categories.CategoryID

				//DTO Data Transformation object

				select Products.ProductID, Products.ProductName, Products.Price, Categories.CategoryName from Products inner join Categories on Products.CategoryID = Categories.CategoryID where Products.Price>10

				select * from Products p inner join orderdetails od  on p.ProductID = od.ProductID

				select * from Customers c inner join orders o on c.CustomerID = o.CustomerID

				select * from Customers c left join orders o on c.CustomerID = o.CustomerID

				select * from Customers c left join orders o on c.CustomerID = o.CustomerID where o.CustomerID is null

				select * from Products p inner join orderdetails od  on p.ProductID = od.ProductID
				inner join Orders o on o.OrderID = od.OrderID



	}

}
