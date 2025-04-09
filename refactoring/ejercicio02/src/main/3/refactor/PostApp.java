package refactor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PostApp {
    private List<Post> posts;

    private List<Post> getPostsOtrosUsuarios(Usuario usuario){
        return this.posts.stream().filter(post -> !post.esDeUsuario(usuario)).collect(Collectors.toList());
    }
    private List<Post> ordenarPorFechaDescendente(List<Post> posts){
        return posts.stream()
                .sorted(Comparator.comparing(Post::getFecha).reversed())
                .collect(Collectors.toList());
    }
    private List<Post> limitPosts (List<Post> posts,int cantidad){
        return posts.stream().limit(cantidad).collect(Collectors.toList());
    }

    public List<Post> ultimosPosts(Usuario usuario, int cantidad){
        posts = this.getPostsOtrosUsuarios(usuario);
        posts = this.ordenarPorFechaDescendente(posts);
        return this.limitPosts(posts,cantidad);
    }


}
