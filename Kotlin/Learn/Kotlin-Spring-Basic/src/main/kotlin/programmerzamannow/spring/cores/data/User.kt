package programmerzamannow.spring.cores.data

import lombok.AllArgsConstructor
import lombok.Data

@Data
@AllArgsConstructor
data class User(private var username: String) {
}