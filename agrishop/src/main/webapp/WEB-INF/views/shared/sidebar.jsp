<p class="lead">Shop Name</p>
			<div class="list-group">
			<c:forEach items="${categories}" var="categoryDTO">
				<a href="${contextRoot}/show/category/${categoryDTO.id}/products" class="list-group-item" id="a_${categoryDTO.name }">${categoryDTO.name}</a>
			</c:forEach>	 
			</div>