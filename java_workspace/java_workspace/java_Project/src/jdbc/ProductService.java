package jdbc;

import java.util.List;

public class ProductService implements Service {
	
	private DAO dao;
	public ProductService() {
		dao = new ProductDAO();
	}
	
	@Override
	public int register(Product product) {
		System.out.println("등록하기 성공 insert_service success!!");
		return dao.insert(product); // dao한테 product를 insert 해줘
	}

	@Override
	public List<Product> list() {
		System.out.println("전체 리스트 가져오기 성공 list_all success!!");
		return dao.selectList();
	}

	@Override
	public Product detail(int pno) {
		System.out.println("디테일 잘 들어옴 detail success!!");
		return dao.selectOne(pno);
	}

	@Override
	public int edit(Product product) {
		System.out.println("수정 성공 edit success!!");
		return dao.update(product);
	}

	@Override
	public int remove(int pno) {
		System.out.println("삭제 성공 remove success!!");
		return dao.delete(pno);
	}
	

}
