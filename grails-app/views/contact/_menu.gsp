<%@ page contentType="text/html;charset=UTF-8" %>
  	<ul id="contacts-menu">
		<li>
			<h2>Create new...</h2>
			<ol id="create-submenu">
				<li>
					<g:link class="create contact" action="create">Contact</g:link>
				</li>
			</ol>
		</li>
		<li>
			<h2>Contacts</h2>
			<ol id="contacts-submenu">
				<li>
					<g:link class="${contactsSection ? '' : 'selected'}" action="list">All contacts</g:link>
				</li>
			</ol>
			<h2>Groups</h2>
			<ol id="groups-submenu">
				<g:each in="${groupInstanceList}" status="i" var="g">
					<li>
						<g:link action="list" id="${g.id}" class="${contactsSection==g ? 'selected' : ''}">${g.name}</g:link>
					</li>
				</g:each>
			</ol>
		</li>
  	</ul>