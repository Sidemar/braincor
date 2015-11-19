package braincor;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.mindmap.DefaultMindmapNode;
import org.primefaces.model.mindmap.MindmapNode;

import main.java.br.ufrn.imd.modelo.Sessao;
import main.java.com.mkyong.core.App;
import main.java.com.mkyong.model.User;

@ManagedBean
public class Hello {

	private MindmapNode root;
	private User user;
	private App serv;
	private StreamedContent logo;
	private MindmapNode selectedNode;
	private List<Sessao> sessoes;
	 private Sessao selectedSessao;

	public Hello() {
		logo = new DefaultStreamedContent(getClass().getResourceAsStream("logo1.png"), "image/png");
		user = new User("", "");
		serv = new App();
		root = new DefaultMindmapNode("google.com", "Google", "FFCC00", false);
		MindmapNode ips = new DefaultMindmapNode("IPs", "IP Nos", "6e9ebf", true);
		MindmapNode ns = new DefaultMindmapNode("NS(s)", "Names", "6e9ebf", true);
		MindmapNode mw = new DefaultMindmapNode("Mw", "Malicious ", "6e9ebf", true);
		root.addNode(ips);
		root.addNode(ns);
		root.addNode(mw);
		Sessao se = new Sessao();
		se.setId("1");
		se.setQuantidade(5);
		sessoes = new ArrayList<Sessao>();
		sessoes.add(se);
	}
	
	public List<Sessao> getSessoes() {
        return sessoes;
    }
	
	public Sessao getSelectedSessao() {
        return selectedSessao;
    }
 
    public void setSelectedSessao(Sessao selectedSessao) {
        this.selectedSessao = selectedSessao;
    }

	public MindmapNode getRoot() {
		return root;
	}

	public void onNodeSelect(SelectEvent event) {
		MindmapNode node = (MindmapNode) event.getObject();
		MindmapNode newnode = new DefaultMindmapNode("Thiago", "thiago", "6e9ebf", true);
		node.addNode(newnode);
	}

	public void onNodeDblselect(SelectEvent event) {
		this.setSelectedNode((MindmapNode) event.getObject());
		MindmapNode newnode = new DefaultMindmapNode("Thiago", "thiago", "6e9ebf", true);
		this.selectedNode.addNode(newnode);
	}

	public String getMessage() {
		return "Hello World JSF!";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void grava() {
		serv.grava(user);
	}

	public StreamedContent getLogo() {
		return logo;
	}

	public MindmapNode getSelectedNode() {
		return selectedNode;
	}

	public void setSelectedNode(MindmapNode selectedNode) {
		this.selectedNode = selectedNode;
	}
}
